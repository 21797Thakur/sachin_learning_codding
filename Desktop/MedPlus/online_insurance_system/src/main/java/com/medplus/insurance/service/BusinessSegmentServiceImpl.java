package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.dao.BusinessSegmentDao;
import com.medplus.insurance.dao.BusinessSegmentDaoImpl;

public class BusinessSegmentServiceImpl implements  BusinessSegmentService {
	BusinessSegmentDao dao = new BusinessSegmentDaoImpl();
	@Override
	public List<String> listBusSeg() {
		List<String> listBusName = dao.listBusSeg();
		return listBusName;
	}
}
