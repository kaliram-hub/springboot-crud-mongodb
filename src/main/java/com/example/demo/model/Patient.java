package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document("patient")
public class Patient {
	
	@Id
	private int id;
	private String PatientName;
	private String PatientContactNo;
	
	
	

}
