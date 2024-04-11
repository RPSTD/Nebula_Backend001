package com.nebula.backend.Repository;

import com.nebula.backend.Document.CustomerReview;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CustomerReviewRepository extends MongoRepository<CustomerReview,String> {

    Optional<CustomerReview> findByReviewId(String s);
}
