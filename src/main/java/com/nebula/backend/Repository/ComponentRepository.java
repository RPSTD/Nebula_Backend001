package com.nebula.backend.Repository;


import com.nebula.backend.Document.Component;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ComponentRepository extends MongoRepository<Component, String> {
    Optional<Component> findByComponentId(String componentId);
}