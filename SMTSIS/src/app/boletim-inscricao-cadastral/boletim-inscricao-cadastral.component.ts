import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-boletim-inscricao-cadastral',
  templateUrl: './boletim-inscricao-cadastral.component.html',
  styleUrls: ['./boletim-inscricao-cadastral.component.css']
})
export class BoletimInscricaoCadastralComponent implements OnInit {

  options = {};

  constructor() { }



  ngOnInit() {
    var elems = document.querySelectorAll('.collapsible');
    var instances = M.Collapsible.init(elems, {accordion: false});
  }

}
