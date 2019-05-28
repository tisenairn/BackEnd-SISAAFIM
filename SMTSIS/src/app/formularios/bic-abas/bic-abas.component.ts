import { Component, OnInit } from '@angular/core';
import { BicService } from './bic.service';

declare var MStepper;


@Component({
  selector: 'app-bic-abas',
  templateUrl: './bic-abas.component.html',
  styleUrls: ['./bic-abas.component.css']
})
export class BicAbasComponent implements OnInit {
  options = {};
  cidades = [];



  constructor(private bicService: BicService) { }

  ngOnInit() {
    // this.consultar();


    this.cpfSelected();
    this.cnpjSelected();
    this.passoapasso();
    this.selectInputs();

  }
  // Serviços HTTP

  consultar() {
    this.bicService.consultar()
    .then(dados => {
      this.cidades = dados;
    })
  }

  adicionar(loteamento: string,
    nomecontribuinte: string,
    natureza: string,
    inscricaoimovel: string,
    areaterreno: string,
    areaunidade: string,
    areaconstruida: string,
    testadaprincipal: string,
    profundidadeprincipal: string
  ){
    this.bicService.adicionar({
      loteamento,
      nomecontribuinte,
      natureza,
      inscricaoimovel,
      areaterreno,
      areaunidade,
      areaconstruida,
      testadaprincipal,
      profundidadeprincipal
    })
    .then(bic => {
      console.log(`Cidade adicionada com código ${bic.id}!`);
      this.consultar();
    });
  }

  excluir(id: number) {
    this.bicService.excluir(id)
    .then(() => {
      alert('Cidade excluída com sucesso!');
      this.consultar();
    });
  }

  atualizar(bic: any) {
    this.bicService.atualizar(bic)
    .then(() => {
      alert('Cidade alterada com sucesso!');
    })
    .catch(erro => {
      alert(erro);
    });
  }


  // Elementos gráficos


passoapasso(){
  let stepper = document.querySelector('.stepper');
  let stepperInstace = new MStepper(stepper, {
    // this.options
    firstActive: 0 // Função padrão para exibir o primeiro passo.
  })
}

selectInputs(){
  let elems = document.querySelectorAll('select');
  let instances = M.FormSelect.init(elems, this.options);
};

cpfSelected(){
  $('input#cpfselected').on('click', function(){
    $('input#cpfcnpj').attr({
      'title': 'A função JQuery funcionou!'
    });
  });
}

cnpjSelected(){
  $('input#cnpjselected').on('click', function(){
    $('input#cpfcnpj').attr({
      'title': 'A outra função JQuery assumiu!'
    });
  });

}
}
