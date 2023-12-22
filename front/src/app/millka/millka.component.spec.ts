import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MillkaComponent } from './millka.component';

describe('MillkaComponent', () => {
  let component: MillkaComponent;
  let fixture: ComponentFixture<MillkaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MillkaComponent]
    });
    fixture = TestBed.createComponent(MillkaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
