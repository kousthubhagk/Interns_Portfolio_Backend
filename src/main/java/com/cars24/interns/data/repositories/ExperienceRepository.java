package com.cars24.interns.data.repositories;

import com.cars24.interns.data.entities.ExperienceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends MongoRepository<ExperienceEntity, Integer> {
}
