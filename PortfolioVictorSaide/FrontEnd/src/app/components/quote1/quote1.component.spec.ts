import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Quote1Component } from './quote1.component';

describe('Quote1Component', () => {
  let component: Quote1Component;
  let fixture: ComponentFixture<Quote1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Quote1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Quote1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
