package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.bean.Policy;
import com.medplus.insurance.dao.PolicyDao;
import com.medplus.insurance.dao.PolicyDaoImpl;

public class PolicyServiceImpl implements PolicyService{
	PolicyDao dao = new PolicyDaoImpl();
	@Override
	public int createPolicy(Double premium, int accountNumber) {
		final int policyNumber=10000;
		int maxPolicyNumber= dao.maxPolicyNumber();
		
		if(maxPolicyNumber!=0)
		{
			maxPolicyNumber++;
		}
		else {
			maxPolicyNumber=policyNumber;
		}
		int row =dao.createPolicy(maxPolicyNumber, premium, accountNumber);
		return row;
	}
	@Override
	public List<Policy> getAllPolicy(String username) {
		List<Policy> policyList = dao.getAllPolicy(username);
		return policyList;
	}
	@Override
	public List<Policy> getAllPolicy() {
		List<Policy> policyList = dao.getAllPolicy();
		return policyList;
	}

}
