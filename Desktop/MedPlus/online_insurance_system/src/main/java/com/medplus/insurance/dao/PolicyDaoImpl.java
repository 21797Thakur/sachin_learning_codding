package com.medplus.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.insurance.bean.Policy;
import com.medplus.insurance.utilities.DBConnection;
import com.medplus.insurance.utilities.PolicyDBQueries;
public class PolicyDaoImpl implements PolicyDao {
	Connection conn;
	PreparedStatement pst;
	@Override
	public int createPolicy(int policyNumber, double premium, int accountNumber ) {
		conn=DBConnection.open();
		int row=0;
		Policy policy = new Policy(policyNumber, premium, accountNumber);
		try {
			pst= conn.prepareStatement(PolicyDBQueries.ADDPOLICY);
			pst.setInt(1,policy.getPolicynumber());
			pst.setDouble(2,policy.getPolicypremium());
			pst.setInt(3,policy.getAccountnumber());
			row =pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int maxPolicyNumber() {
		int policyNumber= 0;
		conn =DBConnection.open();
			try {
				pst = conn.prepareStatement(PolicyDBQueries.MAXPOLNUM);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					policyNumber = rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBConnection.close();
			}
		return policyNumber;
	}

	@Override
	public int getPolicyNumber(int accountNumber) {
		int policyNumber=0;
		conn=DBConnection.open();
		try {
			pst = conn.prepareStatement(PolicyDBQueries.GETPOLNUM);
			pst.setInt(1, accountNumber);
			ResultSet rs =pst.executeQuery();
			while(rs.next())
				policyNumber=rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return policyNumber;
	}

	@Override
	public List<Policy> getAllPolicy(String username) {
		conn=DBConnection.open();
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			pst=conn.prepareStatement(PolicyDBQueries.GETPOLLISTBYUSRNM);
			pst.setString(1, username);;
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				int policyNumber = rs.getInt(1);
				double premium = rs.getDouble(2);
				int accountNumber= rs.getInt(3);
				Policy policy = new Policy(policyNumber, premium, accountNumber);
				policyList.add(policy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return policyList;
	}

	@Override
	public List<Policy> getAllPolicy() {
		conn=DBConnection.open();
		List<Policy> policyList = new ArrayList<Policy>();
		try {
			pst=conn.prepareStatement(PolicyDBQueries.GETPOLLIST);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{	
				int policyNumber = rs.getInt(1);
				double premium = rs.getDouble(2);
				int accountNumber= rs.getInt(3);
				Policy policy = new Policy(policyNumber, premium, accountNumber);
				policyList.add(policy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return policyList;
	}

	@Override
	public int getAccountNumber(int policyNumber) {
		int accountNumber=0;
		conn=DBConnection.open();
		try {
			pst = conn.prepareStatement(PolicyDBQueries.GETACCNUM);
			pst.setInt(1,policyNumber);
			ResultSet rs =pst.executeQuery();
			while(rs.next())
				accountNumber=rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountNumber;
	}
}
