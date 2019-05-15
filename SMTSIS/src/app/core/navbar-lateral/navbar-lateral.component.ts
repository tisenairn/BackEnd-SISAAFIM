import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar-lateral',
  templateUrl: './navbar-lateral.component.html',
  styleUrls: ['./navbar-lateral.component.css']
})
export class NavbarLateralComponent implements OnInit {
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
