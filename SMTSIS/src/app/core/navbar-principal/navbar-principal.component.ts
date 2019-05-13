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
    this.fab();
  }
  navbars(){

    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems, this.options);
  }

  fab(){
    let elems = document.querySelectorAll('.fixed-action-btn');
    let instances = M.FloatingActionButton.init(elems, {
      toolbarEnabled: true
    });
  }
}
