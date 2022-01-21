package com.example.mongoDbProject.repo;

import com.example.mongoDbProject.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long> 
{

}