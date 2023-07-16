package com.medplus.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.medplus.insurance.utilities.DBConnection;
import com.medplus.insurance.utilities.PolicyDBQueries;

public class PolicyDetailDaoImpl implements PolicyDetailDao {
	Connection conn;
	PreparedStatement pst;
	@Override
	public int addPolicyDetail(List<String> ansList, int policynumber, List<String> quesIdList) {
		conn=DBConnection.open();
		int row =0;
		try {
			pst=conn.prepareStatement(PolicyDBQueries.ADDPOLDETAIL);
			int i=0;
			for(String ans:ansList )
			{
				pst.setString(1, ans);
				pst.setInt(2, policynumber);
				pst.setString(3, quesIdList.get(i));
				row =pst.executeUpdate();
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

}
