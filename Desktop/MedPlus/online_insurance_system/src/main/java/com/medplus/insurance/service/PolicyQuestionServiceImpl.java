package com.medplus.insurance.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.medplus.insurance.bean.PolicyQuestion;
import com.medplus.insurance.dao.PolicyQuestionDao;
import com.medplus.insurance.dao.PolicyQuestionDaoImpl;

public class PolicyQuestionServiceImpl implements PolicyQuestionService {
	PolicyQuestionDao dao = new PolicyQuestionDaoImpl();
	Connection conn;
	PreparedStatement pst;

	@Override
	public List<PolicyQuestion> getQuestionlist(int accountnumber) {
		List<PolicyQuestion> questionlist = dao.getQuestionlist(accountnumber);
		return questionlist;
	}

//	@Override
//	public List<String> getAnswerList(List<Integer> ansWeightageList, String BusSegId, String quesId) {
//		conn = DBConnection.open();
//		List<String> ansList = new ArrayList<String>();
//		for (int ansWeightage : ansWeightageList) {
//			String ans = null;
//			if (ansWeightage == 200) {
//				try {
//					pst = conn.prepareStatement(PolicyQuestionDBQueries.GETANS1);
//					pst.setString(1, BusSegId);
//					pst.setString(2, quesId);
//					ResultSet rs = pst.executeQuery();
//					while (rs.next())
//						ans = rs.getString(1);
//					ansList.add(ans);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			} else if (ansWeightage == 400) {
//				try {
//					pst = conn.prepareStatement(PolicyQuestionDBQueries.GETANS2);
//					pst.setString(1, BusSegId);
//					pst.setString(2, quesId);
//					ResultSet rs = pst.executeQuery();
//					while (rs.next())
//						ans = rs.getString(1);
//					ansList.add(ans);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			} else if (ansWeightage == 600) {
//				try {
//					pst = conn.prepareStatement(PolicyQuestionDBQueries.GETANS3);
//					pst.setString(1, BusSegId);
//					pst.setString(2, quesId);
//					ResultSet rs = pst.executeQuery();
//					while (rs.next())
//						ans = rs.getString(1);
//					ansList.add(ans);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return ansList;
//	}

}
