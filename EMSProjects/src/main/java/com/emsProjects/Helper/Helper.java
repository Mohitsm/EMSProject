//package com.emsProjects.Helper;
//
//import com.emsProjects.entity.ExcelEmployee;
//
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Helper {
//
//
//    //check that file is of excel type or not
//    public static boolean checkExcelFormat(MultipartFile file) {
//
//        String contentType = file.getContentType();
//
//        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//
//    //convert excel to list of products
//
//    public static List<ExcelEmployee> convertExcelToListOfProduct(InputStream is) {
//        List<ExcelEmployee> list = new ArrayList<>();
//
//        try {
//
//
//            XSSFWorkbook workbook = new XSSFWorkbook(is);
//
//            XSSFSheet sheet = workbook.getSheet("data");
//
//            int rowNumber = 0;
//            Iterator<Row> iterator = sheet.iterator();
//
//            while (iterator.hasNext()) {
//                Row row = iterator.next();
//
//                if (rowNumber == 0) {
//                    rowNumber++;
//                    continue;
//                }
//
//                Iterator<Cell> cells = row.iterator();
//
//                int cid = 0;
//
//                ExcelEmployee p = new ExcelEmployee();
//
//                while (cells.hasNext()) {
//                    Cell cell = cells.next();
//
//                    switch (cid) {
//                        case 0:
//                           p.setId((int) cell.getNumericCellValue());
//                            break;
//                        case 1:
//                            p.setEmployeeName(cell.getStringCellValue());
//                            break;
//                        case 2:
//                            p.setEmployeeEmail(cell.getStringCellValue());
//                            break;
//                        case 3:
//                            p.setEmployeePassword(cell.getStringCellValue());
//                            break;
//                        case 4:p.setEmployeePhoneNo(cell.getStringCellValue());
//                              break;
//                        default:
//                            break;
//                    }
//                    cid++;
//
//                }
//
//                list.add(p);
//
//
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//
//    }
//
//
//}
