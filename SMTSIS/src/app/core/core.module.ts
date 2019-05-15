import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarPrincipalComponent } from './navbar-principal/navbar-principal.component';
import { NavbarLateralComponent } from './navbar-lateral/navbar-lateral.component';


@NgModule({
  declarations: [
    NavbarPrincipalComponent,
    NavbarLateralComponent
  ],
  exports: [
    NavbarPrincipalComponent,
    NavbarLateralComponent
  ],
  imports: [
    CommonModule
  ]
})
export class CoreModule { }
