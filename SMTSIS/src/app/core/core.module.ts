import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarPrincipalComponent } from './navbar-principal/navbar-principal.component';
import { NavbarLateralComponent } from './navbar-lateral/navbar-lateral.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    NavbarPrincipalComponent,
    NavbarLateralComponent
  ],
  exports: [
    NavbarPrincipalComponent
  ],
  imports: [
    CommonModule,
    RouterModule
  ]
})
export class CoreModule { }
