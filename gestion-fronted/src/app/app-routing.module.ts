import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActualizacionCursoComponent } from './pages/cursos/actualizacion-curso/actualizacion-curso.component';
import { CursosComponent } from './pages/cursos/cursos/cursos.component';
import { RegistroCursoComponent } from './pages/cursos/registro-curso/registro-curso.component';
import { ActualizacionDocenteComponent } from './pages/docentes/actualizacion-docente/actualizacion-docente.component';
import { DocentesComponent } from './pages/docentes/docentes/docentes.component';
import { RegistroDocenteComponent } from './pages/docentes/registro-docente/registro-docente.component';

const routes: Routes = [
  {
    path:'',
    children:[
      {
        path: 'docentes',
        component: DocentesComponent
      },
      {
        path: 'registro-docente',
        component: RegistroDocenteComponent
      },
      {
        path: 'actualizacion-docente',
        component: ActualizacionDocenteComponent
      },
      {
        path: 'cursos',
        component: CursosComponent
      },
      {
        path: 'registro-curso',
        component: RegistroCursoComponent
      },
      {
        path: 'actualizacion-curso',
        component: ActualizacionCursoComponent
      }
    ]
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
