package com.emsProjects.controler;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.emsProjects.paylode.ApiResponse;
import com.emsProjects.paylode.EmployeeDto;
import com.emsProjects.service.EmployeeService;
import com.emsProjects.service.FileService;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)

public class EmployeeControll {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private FileService fileService;
	
	@Value("${project.image}")
	private String path;
	
	//create
	@PostMapping("/")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto createEmployeeDto=this.employeeService.createEmployee(employeeDto);
		return new ResponseEntity<EmployeeDto>(createEmployeeDto,HttpStatus.CREATED);
		
	}
	//update
	@PutMapping("/{employeeId}")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable Integer employeeId){
	
		EmployeeDto updateEmployeeDto=this.employeeService.updateEmployee(employeeDto, employeeId);
		return ResponseEntity.ok(updateEmployeeDto);
	}
	//delete
	@DeleteMapping("/{employeeId}")
	public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable Integer employeeId){
		this.employeeService.deleteEmployee(employeeId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully !!", true),
				HttpStatus.OK);
	}
	//getByID
	@GetMapping("/{employeeId}")
	public ResponseEntity<EmployeeDto> getEmployeeBId(@PathVariable Integer employeeId){
		return ResponseEntity.ok(this.employeeService.getEmployeeId(employeeId));
	}
	
	//getAll
	@GetMapping("/")
	public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
		return ResponseEntity.ok(this.employeeService.getAllemployee());
	}
	//count
	@GetMapping("/count")
	 public ResponseEntity<Long> count() {
        long count = employeeService.count();
        return ResponseEntity.ok(count);
    }
	
	@GetMapping("/total")
	 public ResponseEntity<Double> total(){
		 Double total=employeeService.total();
		 return ResponseEntity.ok(total);
	 }
	
	

}
