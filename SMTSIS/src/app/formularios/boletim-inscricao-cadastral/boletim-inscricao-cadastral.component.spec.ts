import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BoletimInscricaoCadastralComponent } from './boletim-inscricao-cadastral.component';

describe('BoletimInscricaoCadastralComponent', () => {
  let component: BoletimInscricaoCadastralComponent;
  let fixture: ComponentFixture<BoletimInscricaoCadastralComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BoletimInscricaoCadastralComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BoletimInscricaoCadastralComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
