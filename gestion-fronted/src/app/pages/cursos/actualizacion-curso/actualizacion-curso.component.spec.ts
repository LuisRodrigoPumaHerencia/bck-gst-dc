import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActualizacionCursoComponent } from './actualizacion-curso.component';

describe('ActualizacionCursoComponent', () => {
  let component: ActualizacionCursoComponent;
  let fixture: ComponentFixture<ActualizacionCursoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActualizacionCursoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ActualizacionCursoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
