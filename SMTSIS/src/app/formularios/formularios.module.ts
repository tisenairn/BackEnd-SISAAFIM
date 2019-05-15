import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { } from 'materialize-css';
import { HttpClientModule } from '@angular/common/http';

// Componentes
import { CoreModule } from '../core/core.module';
import { BicAbasComponent } from './bic-abas/bic-abas.component';
import { BoletimInscricaoCadastralComponent } from './boletim-inscricao-cadastral/boletim-inscricao-cadastral.component';


@NgModule({
  declarations: [
    BicAbasComponent,
    BoletimInscricaoCadastralComponent
  ],
  exports: [
    BoletimInscricaoCadastralComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    CoreModule
  ]
})
export class FormulariosModule { }
