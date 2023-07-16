package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.bean.Policy;

public interface PolicyService {
	public int createPolicy(Double premium, int accountNumber);

	public List<Policy> getAllPolicy(String username);

	public List<Policy> getAllPolicy();
}
