import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('Test AppComponent', () => {
  it('should have string front', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;

    expect(app.title).toEqual('hell');
  });

  it('should have a h1 with Hello message', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const compiled = fixture.nativeElement;

    expect(compiled.querySelector('h1').textContent).toBe('Hello');
  });
});
