package com.CMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //for foreign key remove all these auto gen type.
	private Long issueId;
	
	@Column(nullable = false)
	private String issueGroup;
	
	@Column(nullable = false)
	private String appDate;

	@Column(nullable = false)
	private Long idUser;
	
//	@ManyToOne
//	@JoinColumn(name = "idUser")
//	private Patients patient;

	

}
