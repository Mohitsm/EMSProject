 package com.emsProjects.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsProjects.entity.Attendance;
import com.emsProjects.exception.ResourceNotFoundException;
import com.emsProjects.paylode.AttendanceDto;
import com.emsProjects.repositry.AttendanceRepo;
import com.emsProjects.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService{
	@Autowired
	private AttendanceRepo attendanceRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public AttendanceDto createAttendance(AttendanceDto attendanceDto) {
		// TODO Auto-generated method stub
		Attendance attendance=this.modelMapper.map(attendanceDto, Attendance.class);
		Attendance createAttendance=this.attendanceRepo.save(attendance);
		return this.modelMapper.map(createAttendance, AttendanceDto.class);
	}

	@Override
	public AttendanceDto updateAttendance(AttendanceDto attendanceDto, Integer attendanceId) {
		// TODO Auto-generated method stub
		Attendance attendance=this.attendanceRepo.findById(attendanceId).orElseThrow(()-> new ResourceNotFoundException("Attendance", "Id", attendanceId));
		
		attendance.setName(attendanceDto.getName());
		attendance.setPunchIn(attendanceDto.getPunchIn());
		attendance.setPunchOut(attendanceDto.getPunchOut());
		Attendance updateAttendance=this.attendanceRepo.save(attendance);
		return this.modelMapper.map(updateAttendance, AttendanceDto.class);
	}

	@Override
	public void deleteAttendance(Integer attendanceId) {
		// TODO Auto-generated method stub
		Attendance attendance=this.attendanceRepo.findById(attendanceId).orElseThrow(()-> new ResourceNotFoundException("Attendance", "Id", attendanceId));

		this.attendanceRepo.delete(attendance);
		
		
	}

	@Override
	public AttendanceDto getAttendanceById(Integer attendanceId) {
		// TODO Auto-generated method stub
		Attendance attendance=this.attendanceRepo.findById(attendanceId).orElseThrow(()-> new ResourceNotFoundException("Attendance", "Id", attendanceId));

		
		return this.modelMapper.map(attendance,AttendanceDto.class);
	}

	@Override
	public List<AttendanceDto> getAllAttendance() {
		// TODO Auto-generated method stub
		List<Attendance> attendances=this.attendanceRepo.findAll();
		List<AttendanceDto> getAllAttendance=attendances.stream().map((at)->this.modelMapper.map(at, AttendanceDto.class)).collect(Collectors.toList());
		return getAllAttendance;
	}

	@Override
	public long countAttendance() {
		// TODO Auto-generated method stub
		return attendanceRepo.count();
	}

	@Override
	public long countAttendancePresent() {
		// TODO Auto-generated method stub
		return attendanceRepo.countByStatus("Present");
	}

	@Override
	public long countAttendanceAbsent() {
		// TODO Auto-generated method stub
		return attendanceRepo.countByStatus("Absent");
	}

	@Override
	public long countAttendanceLate() {
		// TODO Auto-generated method stub
		return attendanceRepo.countByStatus("Late");
	}

	@Override
	public long countAttendanceHalfDay() {
		// TODO Auto-generated method stub
		return attendanceRepo.countByStatus("HalfDay");
	}

	@Override
	public long countAttendancePaidLeave() {
		// TODO Auto-generated method stub
		return attendanceRepo.countByStatus("PaidLeave");
	}

	

		
	
	

}
