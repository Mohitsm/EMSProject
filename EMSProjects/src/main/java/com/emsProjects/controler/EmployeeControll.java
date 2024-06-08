//package com.emsProjects.controler;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//import org.modelmapper.ModelMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.util.StreamUtils;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.emsProjects.entity.Employee;
//import com.emsProjects.paylode.ApiResponse;
//import com.emsProjects.paylode.EmployeeDto;
//import com.emsProjects.paylode.FileResponse;
//import com.emsProjects.repositry.EmployeeRepo;
//import com.emsProjects.service.EmployeeService;
//import com.emsProjects.service.FileService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import jakarta.servlet.http.HttpServletResponse;
//
//@RestController
//@RequestMapping("/api/employee")
//@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
//
//public class EmployeeControll {
//	
//	@Autowired
//	private EmployeeService employeeService;
//	
//	@Autowired
//	private ObjectMapper objectMapper;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//	@Autowired
//	private EmployeeRepo employeeRepo;
//	
//	
//	
//	private Logger logger=LoggerFactory.getLogger(EmployeeControll.class);
//
//	
//	@Autowired
//	private FileService fileService;
//	
//	@Value("${project.image}")
//	private String path;
//	
//	//create
////	@PostMapping("/")
////	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
////		EmployeeDto createEmployeeDto=this.employeeService.createEmployee(employeeDto);
////		return new ResponseEntity<EmployeeDto>(createEmployeeDto,HttpStatus.CREATED);
////		
////	}
//	//create
//	@PostMapping("/")
//	public ResponseEntity<?> createEmployee(@RequestParam("userData") String employee,@RequestParam("file") MultipartFile file) throws JsonMappingException, JsonProcessingException{
//		logger.info("file name {}",file.getOriginalFilename());
//		logger.info("employee:{}",employee);
//		
////		Iamge iamge=objectMapper.readValue(image,Iamge.class);
////		ImageDto imageDto=this.objectMapper.readValue(image, ImageDto.class);
////		
////		ImageDto imageDto2=this.imageService.create(imageDto);
//		EmployeeDto employeeDto=objectMapper.readValue(employee, EmployeeDto.class);
//		EmployeeDto employeeDto2=this.employeeService.createEmployee(employeeDto);
//		Employee employee2=modelMapper.map(employeeDto2, Employee.class);
//	employee2.setZmageName(file.getOriginalFilename());
//	this.employeeRepo.save(employee2);
//		
//		String fileName;
//		try {
//			fileName = this.fileService.uplodeImage(path, file);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return new ResponseEntity<FileResponse>(new FileResponse(null,"Image is successfully not uplodeed !!"), HttpStatus.OK);
//
//		}
//		
//		
//		
//		return new ResponseEntity<FileResponse>(new FileResponse(fileName,"Image is successfully uplodeed !!"), HttpStatus.OK);
//	
//
//	}
//	//update
//	@PutMapping("/{employeeId}")
//	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto,@PathVariable Integer employeeId){
//	
//		EmployeeDto updateEmployeeDto=this.employeeService.updateEmployee(employeeDto, employeeId);
//		return ResponseEntity.ok(updateEmployeeDto);
//	}
//	//delete
//	@DeleteMapping("/{employeeId}")
//	public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable Integer employeeId){
//		this.employeeService.deleteEmployee(employeeId);
//		return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully !!", true),
//				HttpStatus.OK);
//	}
//	//getByID
//	@GetMapping("/{employeeId}")
//	public ResponseEntity<EmployeeDto> getEmployeeBId(@PathVariable Integer employeeId){
//		return ResponseEntity.ok(this.employeeService.getEmployeeId(employeeId));
//	}
//	
//	//getAll
//	@GetMapping("/")
//	public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
//		return ResponseEntity.ok(this.employeeService.getAllemployee());
//	}
//	//count
//	@GetMapping("/count")
//	 public ResponseEntity<Long> count() {
//        long count = employeeService.count();
//        return ResponseEntity.ok(count);
//    }
//	
//	@GetMapping("/total")
//	 public ResponseEntity<Double> total(){
//		 Double total=employeeService.total();
//		 return ResponseEntity.ok(total);
//	 }
//	
//	@GetMapping(value = "/image/{imageName}",produces=MediaType.IMAGE_JPEG_VALUE)
//	public void downlodeFile(@PathVariable("imageName") String imageName,HttpServletResponse response) throws IOException {
//		InputStream resurcee=this.fileService.getResores(path, imageName);
//		
//		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
//		StreamUtils.copy(resurcee, response.getOutputStream());
//	}
//	
//	
//
//}
