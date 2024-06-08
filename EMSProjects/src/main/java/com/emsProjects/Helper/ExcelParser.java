//package com.emsProjects.Helper;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.springframework.stereotype.Component;
//
//import com.emsProjects.entity.ExcelEmployee;
//
//@Component
//public class ExcelParser {
//	
//	  public static List<ExcelEmployee> parse(InputStream inputStream) throws IOException {
//	        List<ExcelEmployee> employees = new ArrayList<>();
//
//	        Workbook workbook = WorkbookFactory.create(inputStream);
//	        Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet
//
//	        Iterator<Row> rowIterator = sheet.iterator();
//	        // Skip header row if needed
//	        if (rowIterator.hasNext()) {
//	            rowIterator.next(); // Skip header row
//	        }
//
//	        while (rowIterator.hasNext()) {
//	            Row row = rowIterator.next();
//	            ExcelEmployee employee = new ExcelEmployee();
//	            employee.setEmployeeEmail(row.getCell(0).getStringCellValue());
//	            employee.setEmployeeName(row.getCell(1).getStringCellValue());
//	            employee.setEmployeePassword(row.getCell(2).getStringCellValue());
//	            employee.setEmployeePhoneNo(row.getCell(3).getStringCellValue());
//	            // Set other properties as needed
//	            employees.add(employee);
//	        }
//
//	        workbook.close();
//	        return employees;
//	    }
//
//}
