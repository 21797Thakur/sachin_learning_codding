package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.bean.Accounts;
import com.medplus.insurance.dao.AccountDao;
import com.medplus.insurance.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	AccountDao dao = new AccountDaoImpl();

	@Override
	public int addAccount(Accounts account) {
		final int accountnumber = 11111;
		int row = 0;
		int maxaccnumber = dao.maxAccountNumber();
		if (maxaccnumber == 0) {
			account.setAccountnumber(accountnumber);
		} else {
			maxaccnumber++;
			account.setAccountnumber(maxaccnumber);
		}
		row = dao.addAccount(account);

		return row;
	}



	@Override
	public List<Accounts> getAccountNumber() {
		List<Accounts> accountlist = dao.getAccountNumberList();
		return accountlist;
	}

	@Override
	public List<Accounts> getAccountNumberList(String username) {
		List<Accounts> accountlist = dao.getAccountNumberList(username);
		return accountlist;
	}



	@Override
	public Accounts GetAccountDetail(int accountNumber) {
		Accounts account = dao.getAccountDetail(accountNumber);
		return account;
	}



	@Override
	public int checkAccount(String username) {
		int row = dao.checkAccount(username);
		return row;
	}

}
