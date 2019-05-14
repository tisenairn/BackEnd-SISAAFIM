import { TestBed } from '@angular/core/testing';

import { BicService } from './bic.service';

describe('BicService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BicService = TestBed.get(BicService);
    expect(service).toBeTruthy();
  });
});
