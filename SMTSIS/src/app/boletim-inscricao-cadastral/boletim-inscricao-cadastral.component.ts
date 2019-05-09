import { Component, OnInit } from '@angular/core';
import { } from 'materialize-css';

@Component({
  selector: 'app-boletim-inscricao-cadastral',
  templateUrl: './boletim-inscricao-cadastral.component.html',
  styleUrls: ['./boletim-inscricao-cadastral.component.css']
})
export class BoletimInscricaoCadastralComponent implements OnInit {

  options = {};
  // declare const M;

  constructor() { }



  ngOnInit() {
    var elems = document.querySelectorAll('select');
    var instances = M.FormSelect.init(elems, this.options);
  }

}
