package com.example.mongoDbProject.repository;

import com.example.mongoDbProject.model.Restaurent;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurentRepository extends MongoRepository<Restaurent, Long> 
{
    
}