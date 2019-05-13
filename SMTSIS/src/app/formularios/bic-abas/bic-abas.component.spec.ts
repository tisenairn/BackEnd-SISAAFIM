import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BicAbasComponent } from './bic-abas.component';

describe('BicAbasComponent', () => {
  let component: BicAbasComponent;
  let fixture: ComponentFixture<BicAbasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BicAbasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BicAbasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
