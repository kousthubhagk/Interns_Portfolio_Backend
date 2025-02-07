package com.cars24.interns.data.dao.impl;

import com.cars24.interns.data.dao.InternDao;
import com.cars24.interns.data.entities.InternEntity;
import com.cars24.interns.data.repositories.InternRepository;
import com.cars24.interns.data.res.GetInternResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class InternDaoImpl implements InternDao {
    @Autowired
    private InternRepository internRepository;
    @Override
    public ResponseEntity<GetInternResponse> getIntern(String name) {

        GetInternResponse getInternResponse = new GetInternResponse();
        InternEntity ie=internRepository.findByName(name);
        getInternResponse.setName(ie.getName());
        getInternResponse.setEducation(ie.getEducation());
        getInternResponse.setEmail(ie.getEmail());
        getInternResponse.setProjects(ie.getProjects());
        getInternResponse.setExperiences(ie.getExperiences());
        getInternResponse.setPhone(ie.getPhone());
        return ResponseEntity.ok(getInternResponse);

    }
}
