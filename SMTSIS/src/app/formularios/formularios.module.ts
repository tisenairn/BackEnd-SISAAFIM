import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { } from 'materialize-css';
import { } from 'materialize-stepper'
import * as $ from 'jquery'

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
    CoreModule,
    RouterModule
  ]
})
export class FormulariosModule { }
