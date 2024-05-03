package com.emsProjects.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsProjects.entity.ExcelEmployee;

public interface ExcelEmployeeRepo extends JpaRepository<ExcelEmployee, Integer>{

}
