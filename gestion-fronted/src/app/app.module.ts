import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DocentesComponent } from './pages/docentes/docentes/docentes.component';
import { RegistroDocenteComponent } from './pages/docentes/registro-docente/registro-docente.component';
import { ActualizacionDocenteComponent } from './pages/docentes/actualizacion-docente/actualizacion-docente.component';
import { RegistroCursoComponent } from './pages/cursos/registro-curso/registro-curso.component';
import { ActualizacionCursoComponent } from './pages/cursos/actualizacion-curso/actualizacion-curso.component';
import { NavbarComponent } from './pages/navbar/navbar/navbar.component';
import { CursosComponent } from './pages/cursos/cursos/cursos.component';

@NgModule({
  declarations: [
    AppComponent,
    DocentesComponent,
    RegistroDocenteComponent,
    ActualizacionDocenteComponent,
    RegistroCursoComponent,
    ActualizacionCursoComponent,
    NavbarComponent,
    CursosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
