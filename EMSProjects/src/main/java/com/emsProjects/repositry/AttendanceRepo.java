package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsProjects.entity.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {
	long countByStatus(String status);

}
