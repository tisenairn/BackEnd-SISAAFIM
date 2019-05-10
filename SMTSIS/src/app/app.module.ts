import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {AccordionModule} from 'primeng/components/accordion/accordion';
import { BoletimInscricaoCadastralComponent } from './boletim-inscricao-cadastral/boletim-inscricao-cadastral.component';
import { BicAbasComponent } from './bic-abas/bic-abas.component';
import { NavbarPrincipalComponent } from './navbar-principal/navbar-principal.component';

@NgModule({
  declarations: [
    AppComponent,
    BoletimInscricaoCadastralComponent,
    BicAbasComponent,
    NavbarPrincipalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AccordionModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
