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
public class Diet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dietId;

	@Column(nullable = false)
	private Long idUser;

	@Column(nullable = false)
	private String dietDate;

	@Column(nullable = false)
	private String dietGiven;

}
