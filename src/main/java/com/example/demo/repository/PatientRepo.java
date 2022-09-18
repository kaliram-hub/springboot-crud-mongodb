package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Patient;

public interface PatientRepo extends MongoRepository<Patient, Integer> {


}
