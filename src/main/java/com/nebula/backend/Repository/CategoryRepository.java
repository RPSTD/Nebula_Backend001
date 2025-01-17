package com.nebula.backend.Repository;

import com.nebula.backend.Document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findByCategoryId(String s);
}
