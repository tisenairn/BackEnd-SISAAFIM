
import { NgModule, ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { NavbarPrincipalComponent } from './core/navbar-principal/navbar-principal.component';
import { BoletimInscricaoCadastralComponent } from './formularios/boletim-inscricao-cadastral/boletim-inscricao-cadastral.component';
import { HomeComponent } from './paginas/home/home.component';

// const homeroutes: Routes = [
//   { path: '', component: HomeComponent },
//   { path: 'dashboard', component: NavbarPrincipalComponent },
//   { path: 'bci', component: BoletimInscricaoCadastralComponent }
//
// ];

// @NgModule({
  //   imports: [RouterModule.forRoot(homeroutes)],
  //   exports: [RouterModule]
  // })
  // export class AppRoutingModule {
    // }

const APP_ROUTES: Routes = [
  // { path: '', component: HomeComponent },
  { path: 'dashboard', component: NavbarPrincipalComponent, children: [
    { path: 'bic', component: BoletimInscricaoCadastralComponent }

  ]}

];
export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);
