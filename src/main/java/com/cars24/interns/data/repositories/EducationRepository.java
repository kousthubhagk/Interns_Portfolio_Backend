package com.cars24.interns.data.repositories;

import com.cars24.interns.data.entities.EducationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends MongoRepository<EducationEntity, Integer> {
}
