package com.emsProjects.paylode;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QulificationDto {
	private Integer qulificationId;
	@Column(length = 255)
	private String  matricBoard;
	@Column(length = 255)
	private String  matricInstitute;
	@Column(length = 255)
	private String  matricPassingYear;
	@Column(length = 255)
	private String  matricTotalMarks;
	@Column(length = 255)
	private String   matricObtentMarks;
	@Column(length = 255)
	private String  matricPercentage;
	@Column(length = 255)
	private String  interBoard;
	@Column(length = 255)
	private String  interInstitute;
	@Column(length = 255)
	private String  interPassingYear;
	@Column(length = 255)
	private String  interObtentMarks;
	@Column(length = 255)
	private String  interPercentage;
	@Column(length = 255)
	private String  interTotalMarks;
	@Column(length = 255)
	private String  graduationBoard;
	@Column(length = 255)
	private String  graduationInstitute;
	@Column(length = 255)
	private String  graduationPassingYear;
	@Column(length = 255)
	private String  graduationTotalMarks;
	@Column(length = 255)
	private String  graduationObtentMarks;
	@Column(length = 255)
	private String  graduationPercentage;
	@Column(length = 255)
	private String  pgBoard;
	@Column(length = 255)
	private String  pgInstitute;
	@Column(length = 255)
	private String pgPassingYear;
	@Column(length = 255)
	private String   pgTotalMarks;
	@Column(length = 255)
	private String   pgObtentMarks;
	@Column(length = 255)
	private String pgPercentage;
	@Column(length = 255)
	private String   otherBoard;
	@Column(length = 255)
	private String   otherInstitute;
	@Column(length = 255)
	private String   otherPassingYear;
	@Column(length = 255)
	private String   otherTotalMarks;
	@Column(length = 255)
	private String   otherObtentMarks;
	@Column(length = 255)
	private String otherPercentage;

}
