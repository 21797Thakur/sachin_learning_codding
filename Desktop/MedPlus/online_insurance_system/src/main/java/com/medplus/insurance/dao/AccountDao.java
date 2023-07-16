package com.medplus.insurance.dao;

import java.util.List;

import com.medplus.insurance.bean.Accounts;

public interface AccountDao {
	public int addAccount(Accounts account);

	public int maxAccountNumber();
	
	public Accounts getAccountDetail(int accountNumber);

	public List<Accounts> getAccountNumberList();

	public List<Accounts> getAccountNumberList(String username);
	
	public int checkAccount(String username);
	
}
