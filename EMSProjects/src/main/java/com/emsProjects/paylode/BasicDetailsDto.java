package com.emsProjects.paylode;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BasicDetailsDto {
	
	private Integer basicDetailsId;
	@Column(length = 255)
	private String blodGroup;
	@Column(length = 255)
	private String fatherName;
	@Column(length = 255)
    private String password;
	@Column(length = 255)
	private String firstName;
	@Column(length = 255)
	private String  middleName;
	@Column(length = 255)
	private String lastName;
	@Column(length = 255)
	private String email;
	@Column(length = 255)
	private String officialEmail;
	@Column(length = 255)
	private String motherName;
	@Column(length = 255)
	private String  status;
	@Column(length = 255)
	private String  gender;
	@Column(length = 255)
	private String  employeeCode;
	@Column(length = 255)
	private String mobile;
	@Column(length = 255)
	private String officialMobile;
    @Column(length = 255)
	private String joningDate;
	@Column(length = 255)
	private String dateOfBirth;
	@Column(length = 255)
    private String  marritalStatus;
	
	

}
