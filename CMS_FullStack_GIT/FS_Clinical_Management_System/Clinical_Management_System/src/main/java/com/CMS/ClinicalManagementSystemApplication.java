package com.CMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicalManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalManagementSystemApplication.class, args);
		System.out.println("Hello Patients...!");
	}

}
