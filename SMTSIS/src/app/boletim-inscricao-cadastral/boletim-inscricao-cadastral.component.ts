import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-boletim-inscricao-cadastral',
  templateUrl: './boletim-inscricao-cadastral.component.html',
  styleUrls: ['./boletim-inscricao-cadastral.component.css']
})
export class BoletimInscricaoCadastralComponent implements OnInit {
  declare const M;

  options = {};

  constructor() { }



  ngOnInit() {
    var elems = document.querySelectorAll('select');
    var instances = M.FormSelect.init(elems, this.options);
  }

}
