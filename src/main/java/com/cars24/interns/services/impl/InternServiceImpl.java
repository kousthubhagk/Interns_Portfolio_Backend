package com.cars24.interns.services.impl;

import com.cars24.interns.data.dao.impl.InternDaoImpl;
import com.cars24.interns.data.entities.InternEntity;
import com.cars24.interns.data.res.GetInternResponse;
import com.cars24.interns.services.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InternServiceImpl implements InternService {
    @Autowired
    private InternDaoImpl internDao;
    @Override
    public ResponseEntity<GetInternResponse> getIntern(String name) {
        ResponseEntity<GetInternResponse> response = internDao.getIntern(name);


        return response;
    }
}
