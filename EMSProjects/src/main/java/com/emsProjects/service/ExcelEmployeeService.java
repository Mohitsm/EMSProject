package com.emsProjects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.emsProjects.Helper.ExcelParser;
import com.emsProjects.Helper.Helper;
import com.emsProjects.entity.ExcelEmployee;
import com.emsProjects.repositry.ExcelEmployeeRepo;

@Service
public class ExcelEmployeeService {
	
	
	@Autowired
	private ExcelEmployeeRepo excelEmployeeRepo;
	
	public void save(MultipartFile file) {
		try {
			List<ExcelEmployee> employees=ExcelParser.parse(file.getInputStream());
			this.excelEmployeeRepo.saveAll(employees);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public List<ExcelEmployee> getAllExcelEmployees(){
		return this.excelEmployeeRepo.findAll();
	}

}
