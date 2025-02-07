package com.cars24.interns.data.dao;

import com.cars24.interns.data.res.GetInternResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface InternDao {
    public ResponseEntity<GetInternResponse> getIntern(String name);
}
