import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BoletimInscricaoCadastralComponent } from './boletim-inscricao-cadastral/boletim-inscricao-cadastral.component';

@NgModule({
  declarations: [
    AppComponent,
    BoletimInscricaoCadastralComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
