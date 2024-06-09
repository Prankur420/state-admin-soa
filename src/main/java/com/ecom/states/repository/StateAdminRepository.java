package com.ecom.states.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecom.states.documents.StatesDocument;

@Repository
public interface StateAdminRepository extends MongoRepository<StatesDocument, String> {

}