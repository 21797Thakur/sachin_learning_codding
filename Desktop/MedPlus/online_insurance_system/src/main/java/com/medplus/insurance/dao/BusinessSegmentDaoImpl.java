package com.medplus.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.insurance.utilities.BusinessSegmentDBQueries;
import com.medplus.insurance.utilities.DBConnection;

public class BusinessSegmentDaoImpl implements BusinessSegmentDao {
	Connection conn;
	PreparedStatement pst;

	@Override
	public String getBusSegId(int accountnumber) {
		conn = DBConnection.open();
		String busSegId = null;
		try {
			pst = conn.prepareStatement(BusinessSegmentDBQueries.GETBUSSEGID);
			pst.setInt(1, accountnumber);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				 busSegId = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return busSegId;
	}

	@Override
	public List<String> listBusSeg() {
		List<String> listBus = new ArrayList<String>();
		conn = DBConnection.open();
		try {
			pst = conn.prepareStatement(BusinessSegmentDBQueries.lSTBUSSEG);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				listBus.add(name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return listBus;
	}

}
