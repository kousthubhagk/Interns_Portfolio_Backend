package com.cars24.interns.data.repositories;

import com.cars24.interns.data.entities.ProjectEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<ProjectEntity, Integer> {
}
