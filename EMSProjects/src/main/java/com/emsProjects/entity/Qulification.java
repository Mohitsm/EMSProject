package com.emsProjects.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "qulification")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Qulification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer QulificationId;
	private String qulificationType;
	private String university;
	private String college;
	private String passingYear;

	private String totalMarks;

	private String obtentMarks;


}
