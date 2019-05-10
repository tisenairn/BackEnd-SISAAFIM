import { Component, OnInit } from '@angular/core';
import { } from 'materialize-css';


@Component({
  selector: 'app-bic-abas',
  templateUrl: './bic-abas.component.html',
  styleUrls: ['./bic-abas.component.css']
})
export class BicAbasComponent implements OnInit {
  options = {};

    constructor() { }

    ngOnInit() {
      this.colapsaveis();
      this.seletores();

    }

    seletores(){
      var elems = document.querySelectorAll('select');
      var instances = M.FormSelect.init(elems, this.options);
    }

    colapsaveis(){
      var elems = document.querySelectorAll('.collapsible');
      var instances = M.Collapsible.init(elems, this.options);
    }

  }
