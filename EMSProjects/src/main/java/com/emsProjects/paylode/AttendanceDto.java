package com.emsProjects.paylode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceDto {
	
	private Integer attendanceId;
	private String name;
	private String punchIn;
	private String punchOut;
	private String status;


}
