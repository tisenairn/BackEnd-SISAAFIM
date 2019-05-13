import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarPrincipalComponent } from './navbar-principal/navbar-principal.component';


@NgModule({
  declarations: [
    NavbarPrincipalComponent
  ],
  exports: [
    NavbarPrincipalComponent
  ],
  imports: [
    CommonModule
  ]
})
export class CoreModule { }
