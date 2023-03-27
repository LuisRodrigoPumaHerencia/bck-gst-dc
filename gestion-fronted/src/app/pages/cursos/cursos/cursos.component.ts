import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.scss']
})
export class CursosComponent {
  constructor(
    private router:Router
  ){

  }
  
  irRegistrocurso(){
    this.router.navigate(['/registro-curso']);
  }
}
