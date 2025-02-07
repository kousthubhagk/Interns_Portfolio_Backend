package com.cars24.interns.data.repositories;

import com.cars24.interns.data.entities.InternEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends MongoRepository<InternEntity, Integer> {
    public InternEntity findByName(String name);
}
