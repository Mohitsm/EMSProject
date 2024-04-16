package com.emsProjects.paylode;

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
	private String qulificationType;
	private String university;
	private String college;
	private String passingYear;

	private String totalMarks;

	private String obtentMarks;

}
