package com.example.mongoDbProject.repo;

import com.example.mongoDbProject.model.Restaurent;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResRepo extends MongoRepository<Restaurent, Long> 
{

}