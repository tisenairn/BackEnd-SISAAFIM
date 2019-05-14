import { Component, OnInit } from '@angular/core';
import { BicService } from './bic.service';



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
    this.colapsaveis();
    this.seletores();
    this.consultar();

  }
  // Serviço HTTP

  consultar() {
    this.bicService.consultar()
    .then(dados => {
      this.cidades = dados;
    })
  }

  adicionar(loteamento: string, nomecontribuinte: string, natureza: string, inscricaoimovel: string ) {
    this.bicService.adicionar({ loteamento, nomecontribuinte, natureza, inscricaoimovel })
    .then(bic => {
      alert(`Cidade adicionada com código ${bic.id}!`);
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
  seletores(){
    var elems = document.querySelectorAll('select');
    var instances = M.FormSelect.init(elems, this.options);
  }

  colapsaveis(){
    var elems = document.querySelectorAll('.collapsible');
    var instances = M.Collapsible.init(elems, {
      accordion: false
    });
  }



}
