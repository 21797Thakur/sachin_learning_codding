package com.medplus.insurance.dao;

import java.util.List;

import com.medplus.insurance.bean.Policy;

public interface PolicyDao {
	public int createPolicy(int policyNumber, double premium, int accountnumber);

	public int maxPolicyNumber();

	public int getPolicyNumber(int accountNumber);
	
	public int getAccountNumber(int policyNumber);

	public List<Policy> getAllPolicy(String username);

	public List<Policy> getAllPolicy();
}
