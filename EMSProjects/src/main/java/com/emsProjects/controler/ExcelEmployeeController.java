//package com.emsProjects.controler;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.emsProjects.Helper.Helper;
//import com.emsProjects.entity.ExcelEmployee;
//import com.emsProjects.service.ExcelEmployeeService;
//
//
//@RestController
//public class ExcelEmployeeController {
//	
//	@Autowired
//	private ExcelEmployeeService excelEmployeeService;
//	
//	@PostMapping("/uplode")
//	public ResponseEntity<?> uplode(@RequestParam("file") MultipartFile file){
//		try {
//			excelEmployeeService.save(file);
//			return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));
//		} catch (Exception e) {
//			// TODO: handle exception
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
//
//		}
//	}
//	
//	
//	@GetMapping("/")
//	public List<ExcelEmployee> getAllEmployees(){
//		return this.excelEmployeeService.getAllExcelEmployees();
//	}
//
//}
