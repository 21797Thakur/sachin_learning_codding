package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.bean.Accounts;

public interface AccountService {
public int addAccount(Accounts account);
public List<Accounts> getAccountNumber();
public List<Accounts> getAccountNumberList(String username);
public Accounts GetAccountDetail(int accountNumber);
public int checkAccount(String username);
}
