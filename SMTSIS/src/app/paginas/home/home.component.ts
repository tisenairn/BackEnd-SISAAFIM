import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery';

// declare var $:any;

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    this.homepreloader();

  }

  homepreloader(){
    $('.preloader-background')
    .delay(1700)
    .fadeOut('slow');

    $('.preloader-wrapper')
    .delay(1700)
    .fadeOut();
  };



}
