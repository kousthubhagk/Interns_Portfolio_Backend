package com.cars24.interns.services;

import com.cars24.interns.data.res.GetInternResponse;
import org.springframework.http.ResponseEntity;

public interface InternService {
    public ResponseEntity<GetInternResponse> getIntern(String name);
}
