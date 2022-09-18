package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepo;

@RestController
public class PatientController {

	@Autowired
	private PatientRepo patientRepo;

	@PostMapping("/addPatient")
	public String savePatient(@RequestBody Patient patient) {
		patientRepo.save(patient);

		return "Added Successfully" ;
	}

	@GetMapping("/findAllPatient")
	public List<Patient> getPatient() {
		return patientRepo.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable int Id) {
		patientRepo.deleteById(Id);

		return "Deleted Successfully";
	}

}
