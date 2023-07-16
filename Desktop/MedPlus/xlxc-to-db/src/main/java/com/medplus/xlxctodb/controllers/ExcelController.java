package com.medplus.xlxctodb.controllers;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.medplus.xlxctodb.services.ExcelOperationServiceImpl;

@RestController
@RequestMapping
public class ExcelController {
	
	@Autowired
	ExcelOperationServiceImpl service;
	
	@PostMapping("/excel")
	public ResponseEntity<String> excelReader(@RequestParam("file") MultipartFile excel) {
		String str= service.readExcell(excel);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
