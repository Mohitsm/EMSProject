package com.emsProjects.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsProjects.paylode.ApiResponse;
import com.emsProjects.paylode.QulificationDto;
import com.emsProjects.service.QulificationService;

@RestController
@RequestMapping("/api/qulification")
public class QulificationControll {
	
	@Autowired
	private QulificationService qulificationService;
	
	//create
		@PostMapping("/")
		public ResponseEntity<QulificationDto> createQualification(@RequestBody QulificationDto qualificationDto){
			QulificationDto createQualification=this.qulificationService.createQulification(qualificationDto);
			return new ResponseEntity<QulificationDto>(createQualification,HttpStatus.CREATED);
			
		}
		
		//update
		@PutMapping("/{qulificationId}")
		public ResponseEntity<QulificationDto> updateQulification(@RequestBody QulificationDto qualificationDto,@PathVariable Integer qulificationId){
			QulificationDto updateQualification=this.qulificationService.updateQulification(qualificationDto, qulificationId);
			
			return ResponseEntity.ok(updateQualification);
			
		}
		//delete
		@DeleteMapping("/{qulificationId}")
		public ResponseEntity<ApiResponse> deleteQualification(@PathVariable Integer qulificationId){
			this.qulificationService.deleteQulification(qulificationId);
			return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully !!", true),
					HttpStatus.OK);
		}
		
		//getbyid
		@GetMapping("/{qulificationId}")
		public ResponseEntity<QulificationDto> getQualificationById(@PathVariable Integer qulificationId){
			return ResponseEntity.ok(this.qulificationService.getQulificationById(qulificationId));
		}
		//getAllQualification
		@GetMapping("/")
		public ResponseEntity<List<QulificationDto>> getAllQualification(){
			return ResponseEntity.ok(this.qulificationService.getaAllQulification());
		}


}
