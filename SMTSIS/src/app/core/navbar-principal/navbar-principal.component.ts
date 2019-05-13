import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar-principal',
  templateUrl: './navbar-principal.component.html',
  styleUrls: ['./navbar-principal.component.css']
})
export class NavbarPrincipalComponent implements OnInit {

options = {};

  constructor() { }

  ngOnInit() {
    this.navbars();
  }
  navbars(){

    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems, this.options);
  }
}
