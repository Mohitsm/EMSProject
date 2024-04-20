package com.emsProjects.entity;

import jakarta.persistence.Column;
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
@Table(name = "Previous_Work")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PreviousWork {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer previousWorkId;
	@Column(length = 255)
	private String companyName;
	@Column(length = 255)
	private String  designation;
	@Column(length = 255)
	private String fromData;
	@Column(length = 255)
	private String  toData;
	@Column(length = 255)
	private String duration;
	

}
