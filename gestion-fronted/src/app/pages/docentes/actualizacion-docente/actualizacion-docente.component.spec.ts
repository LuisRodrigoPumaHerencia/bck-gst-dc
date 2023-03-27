import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ActualizacionDocenteComponent } from './actualizacion-docente.component';

describe('ActualizacionDocenteComponent', () => {
  let component: ActualizacionDocenteComponent;
  let fixture: ComponentFixture<ActualizacionDocenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ActualizacionDocenteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ActualizacionDocenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
