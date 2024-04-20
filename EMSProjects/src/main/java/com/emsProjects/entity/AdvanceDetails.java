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
@Table(name = "Advance_Details")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer advanceDetailsId;
	@Column(length = 255)
	private String  uanNumber;
	@Column(length = 255)
	private String esicNumber;
	@Column(length = 255)
	private String  panNumber;
	@Column(length = 255)
	private String  aadharNumber;
	@Column(length = 255)
	private String  InsuranceNumber;
	@Column(length = 255)
	private String drivingLicenceNumber;
	@Column(length = 255)
	private String  ipNumber;
	@Column(length = 255)
	private String  pfNumber;
	@Column(length = 255)
	private String  probationPeriod;
	@Column(length = 255)
	private String ctcAfterProbation;
	@Column(length = 255)
	private String client;
	@Column(length = 255)
	private String  deleverySubType;
	@Column(length = 255)
	private String clientId;
	@Column(length = 255)
	private String deleveryType;
	
	

}
