package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.dao.BusinessSegmentDao;
import com.medplus.insurance.dao.BusinessSegmentDaoImpl;
import com.medplus.insurance.dao.PolicyDao;
import com.medplus.insurance.dao.PolicyDaoImpl;
import com.medplus.insurance.dao.PolicyDetailDao;
import com.medplus.insurance.dao.PolicyDetailDaoImpl;
import com.medplus.insurance.dao.PolicyQuestionDao;
import com.medplus.insurance.dao.PolicyQuestionDaoImpl;

public class PolicyDetailServiceImpl implements PolicyDetailService{
	@Override
	public int addPolicyDetail(List<Integer> ansWeightageList, int accountnumber,List<String> questList) {
		BusinessSegmentDao dao = new BusinessSegmentDaoImpl();
		PolicyQuestionDao dao1 = new PolicyQuestionDaoImpl();
		PolicyDao dao2 =new PolicyDaoImpl();
		PolicyDetailDao dao3 =new PolicyDetailDaoImpl();
//business id from account number		
		String BusSegId = dao.getBusSegId(accountnumber);	
// quesId list with question desc
		List<String>quesIdList =dao1.getQuestIdList(questList,BusSegId);
//answer list from list of question answer weightage
		List<String> ansList = dao1.getAnswerList(ansWeightageList, BusSegId, quesIdList);
// policy number from account number
		int policyNumber= dao2.getPolicyNumber(accountnumber);
		int row = dao3.addPolicyDetail(ansList, policyNumber,quesIdList);
		return row;
	}

}
