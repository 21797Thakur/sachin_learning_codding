package com.medplus.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.insurance.bean.Accounts;
import com.medplus.insurance.utilities.AccountDBQueries;
import com.medplus.insurance.utilities.DBConnection;

public class AccountDaoImpl implements AccountDao {
	Connection conn;
	PreparedStatement pst;

	@Override
	public int addAccount(Accounts account) {
		conn = DBConnection.open();
		int row = 0;
		try {
			pst = conn.prepareStatement(AccountDBQueries.CREATEACCOUNT);
			pst.setInt(1, account.getAccountnumber());
			pst.setString(2, account.getInsuredname());
			pst.setString(3, account.getInsuredstreet());
			pst.setString(4, account.getInsuredcity());
			pst.setString(5, account.getInsuredstate());
			pst.setInt(6, account.getInsuredzip());
			pst.setString(7, account.getBusinesssegment());
			pst.setString(8, account.getUsername());
			row = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return row;
	}

	@Override
	public int maxAccountNumber() {
		conn = DBConnection.open();
		int maxaccnumber = 0;
		try {
			pst = conn.prepareStatement(AccountDBQueries.MAXACCNUMB);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				maxaccnumber = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return maxaccnumber;
	}
	@Override
	public List<Accounts> getAccountNumberList() {
		List<Accounts> accountlist = new ArrayList<Accounts>();
		conn = DBConnection.open();

		try {
			pst = conn.prepareStatement(AccountDBQueries.ACCOUNTLIST);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Accounts account = new Accounts();
				account.setAccountnumber(rs.getInt(1));
				account.setInsuredname(rs.getString(2));
				accountlist.add(account);
			}
			for (Accounts ac : accountlist) {
				System.out.println(ac.getAccountnumber());
				System.out.println(ac.getInsuredname());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return accountlist;
	}

	@Override
	public List<Accounts> getAccountNumberList(String username) {
		List<Accounts> accountlist = new ArrayList<Accounts>();
		conn = DBConnection.open();
		try {
			pst = conn.prepareStatement(AccountDBQueries.ACCTLISTBYROLE);
			pst.setString(1, username);;
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Accounts account = new Accounts();
				account.setAccountnumber(rs.getInt(1));
				account.setInsuredname(rs.getString(2));
				accountlist.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return accountlist;
	}

	@Override
	public Accounts getAccountDetail(int accountNumber) {
			conn = DBConnection.open();
			Accounts account = new Accounts();
			try {
				pst = conn.prepareStatement(AccountDBQueries.ACCTLIST);
				pst.setInt(1, accountNumber);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
//					account.setAccountnumber(rs.getInt(1));
					account.setInsuredname(rs.getString(1));
					account.setInsuredstreet(rs.getString(2));
					account.setInsuredcity(rs.getString(3));
					account.setInsuredstate(rs.getString(4));
					account.setInsuredzip(rs.getInt(5));
					account.setBusinesssegment(rs.getString(6));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnection.close();
			}
			return account;
	}

	@Override
	public int checkAccount(String username) {
		conn= DBConnection.open();
		int row=0 ;
		try {
			pst= conn.prepareStatement(AccountDBQueries.CHCKACCT);
			pst.setString(1, username);
		ResultSet resultset = pst.executeQuery();
		while(resultset.next())
			row =resultset.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close();
		}
		return row;
	}

}
