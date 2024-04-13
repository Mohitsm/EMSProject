package com.emsProjects.paylode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
	
	private String message;
	private boolean success;
	public ApiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
	

}
