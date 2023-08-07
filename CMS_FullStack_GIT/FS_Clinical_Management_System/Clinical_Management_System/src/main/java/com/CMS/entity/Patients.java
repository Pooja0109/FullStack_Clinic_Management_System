package com.CMS.entity;

import java.time.LocalDate;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Patients {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long idUser;
	
	@Column(nullable = false)
		private String firstName;
	
	@Column(nullable = false)
		private String lastName;
	
	@Column(nullable = false)
		private String email;
	
	@Column(nullable = false)
		private int age;
	
	@Column(nullable = false)
		private String gender;
	
	@Column(nullable = false)
		private String city;
	
	@Column(nullable = false)
		private String state;
	
	@Column(nullable = false)
		private String pincode;
	
	@Column(nullable = false)
		private Long contact;
	
	@Column(nullable = false)
		private Long emgContact;
	
	@Column(nullable = false)
		private int height;
	
	@Column(nullable = false)
		private int weight;
	
	@Column(nullable = false)
		private String bloodGroup;
	
	@Column(nullable = false)
		private String appoint;
	
	@Column(nullable = false)
		private String issueGroup;
	
//	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
//    private List<Appointment> appointments;

}
