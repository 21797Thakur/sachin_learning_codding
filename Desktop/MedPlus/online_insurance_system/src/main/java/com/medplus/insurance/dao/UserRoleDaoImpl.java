package com.medplus.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.medplus.insurance.bean.UserRole;
import com.medplus.insurance.utilities.DBConnection;
import com.medplus.insurance.utilities.UserRoleDBQueries;

public class UserRoleDaoImpl implements UserRoleDao {
	Connection conn;
	PreparedStatement pst;

	@Override
	public int createAccount(UserRole user) {
		int row = 0;
		conn = DBConnection.open();
		try {
			pst = conn.prepareStatement(UserRoleDBQueries.CREATEUSER);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getRole());
			row = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return row;
	}

	public String checkUser(UserRole us) {
		String role = null;
		conn = DBConnection.open();
		try {
			pst = conn.prepareStatement(UserRoleDBQueries.CHECKUSER);
			pst.setString(1, us.getUsername());
			pst.setString(2, us.getPassword());
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				role = rs.getString(1);
			}
		} catch (SQLException e) {
			return role;
		}finally {
			DBConnection.close();
		}
		return role;
	}
}
