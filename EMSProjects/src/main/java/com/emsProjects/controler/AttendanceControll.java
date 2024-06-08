//package com.emsProjects.controler;
//
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.emsProjects.paylode.ApiResponse;
//import com.emsProjects.paylode.AttendanceDto;
//import com.emsProjects.service.AttendanceService;
//
//@RestController
//@RequestMapping("/api/attendance")
//public class AttendanceControll {
//	
//	@Autowired
//	private AttendanceService attendanceService;
//	
//	//cretae
//	@PostMapping("/")
//	public ResponseEntity<AttendanceDto> createAttendance(@RequestBody AttendanceDto attendanceDto){
//		
//		AttendanceDto createAttendance=this.attendanceService.createAttendance(attendanceDto);
//		
//		return new ResponseEntity<AttendanceDto>(createAttendance,HttpStatus.CREATED);
//	}
//
//	//update
//	@PutMapping("/{attendanceId}")
//	public ResponseEntity<AttendanceDto> updateAttendance(@RequestBody AttendanceDto attendanceDto,@PathVariable Integer attendanceId){
//		AttendanceDto updateAttendance=this.attendanceService.updateAttendance(attendanceDto, attendanceId);
//		return ResponseEntity.ok(updateAttendance);
//	}
//	//delete
//	@DeleteMapping("/{attendanceId}")
//	public ResponseEntity<ApiResponse> deleteAttendance(@PathVariable Integer attendanceId){
//		this.attendanceService.deleteAttendance(attendanceId);
//		return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully !!", true),
//				HttpStatus.OK); 
//	}
//	//getAttendanceById
//	@GetMapping("/{attendanceId}")
//	public ResponseEntity<AttendanceDto> getAttendanceById(@PathVariable Integer attendanceId){
//		return ResponseEntity.ok(this.attendanceService.getAttendanceById(attendanceId));
//	}
//	//getAll
//	@GetMapping("/")
//	public ResponseEntity<List<AttendanceDto>> getAllAttendance(){
//		return ResponseEntity.ok(this.attendanceService.getAllAttendance());
//	}
//	
//	//count
//	 @GetMapping("/count")
//	 public ResponseEntity<Long> count() {
//        long count = attendanceService.countAttendance();
//        return ResponseEntity.ok(count);
//    }
//	 @GetMapping("/countp")
//	 public ResponseEntity<Long> countAttendancePresent() {
//        long count = attendanceService.countAttendancePresent();
//        return ResponseEntity.ok(count);
//    }
//	 @GetMapping("/counta")
//	 public ResponseEntity<Long> countAttendanceAbsent() {
//        long count = attendanceService.countAttendanceAbsent();
//        return ResponseEntity.ok(count);
//    }
//	 @GetMapping("/countl")
//	 public ResponseEntity<Long> countAttendanceLate() {
//        long count = attendanceService.countAttendanceLate();
//        return ResponseEntity.ok(count);
//    }
//	 @GetMapping("/counth")
//	 public ResponseEntity<Long> countAttendanceHalfDay() {
//        long count = attendanceService.countAttendanceHalfDay();
//        return ResponseEntity.ok(count);
//    }
//	 @GetMapping("/countpl")
//	 public ResponseEntity<Long> countAttendancePaidLeave() {
//        long count = attendanceService.countAttendancePaidLeave();
//        return ResponseEntity.ok(count);
//    }
//}
