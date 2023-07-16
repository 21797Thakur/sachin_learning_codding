package com.medplus.xlxctodb.services;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelOperationService {
	 public String readExcell(MultipartFile excel);
}
