package com.CMS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Prescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prepId;
	
	@Column(nullable = false)
	private Long idUser;
	
	@Column(nullable = false)
	private String preDate;
	
	@Column(nullable = false)
	private String prescribe;
	
}
