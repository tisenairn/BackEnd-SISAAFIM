import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { routing } from './app-routing.module';
import { AppComponent } from './app.component';

// Importações internas
import { CoreModule } from './core/core.module';
import { FormulariosModule } from './formularios/formularios.module';
import { PaginasModule } from './paginas/paginas.module';

// primeng
import {AccordionModule} from 'primeng/components/accordion/accordion';



@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    routing,
    AccordionModule,
    CoreModule,
    FormulariosModule,
    PaginasModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
