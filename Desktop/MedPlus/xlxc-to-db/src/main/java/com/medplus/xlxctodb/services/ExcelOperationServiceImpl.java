package com.medplus.xlxctodb.services;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ExcelOperationServiceImpl implements ExcelOperationService{
	
 public String readExcell(MultipartFile excel)
 {
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(excel.getInputStream());
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
					System.out.print(row.getCell(j) +" ");
				}
				System.out.println("");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
 }
}
