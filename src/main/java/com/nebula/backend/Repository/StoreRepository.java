package com.nebula.backend.Repository;

import com.nebula.backend.Document.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StoreRepository extends MongoRepository<Store, String> {

    Optional<Store> findByStoreId(String s);
}