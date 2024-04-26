package com.emsProjects.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsProjects.paylode.AddressDto;
import com.emsProjects.paylode.EmployeeDto;
import com.emsProjects.paylode.ProjectDto;
import com.emsProjects.service.AddressService;
import com.emsProjects.service.AdvanceDetailsService;
import com.emsProjects.service.BAsicDetailsService;
import com.emsProjects.service.BankDetailsService;
import com.emsProjects.service.FamilyDetailsService;
import com.emsProjects.service.PermissionsService;
import com.emsProjects.service.PreviousWorkService;
import com.emsProjects.service.ProjectService;
import com.emsProjects.service.QulificationService;



@RequestMapping("api/project")
@RestController
public class ProjectControll {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private BAsicDetailsService bAsicDetailsService;
	
	@Autowired
	private AdvanceDetailsService advanceDetailsService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private BankDetailsService bankDetailsService;
	@Autowired
	private QulificationService qulificationService;
	@Autowired
	private PreviousWorkService previousWorkService;
	@Autowired
	private PermissionsService permissionsService;
	@Autowired
	private FamilyDetailsService familyDetailsService;
	
	
	@PostMapping("/")
	public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto ){
		
		ProjectDto projectDto2=this.projectService.createProject(projectDto);
		return new ResponseEntity<ProjectDto>(projectDto2,HttpStatus.CREATED);
	}
	@GetMapping("/")
	public ResponseEntity<List<ProjectDto>> getAllEmployee(){
		return ResponseEntity.ok(this.projectService.getAllProject());
	}
	
}
