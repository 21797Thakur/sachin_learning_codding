package com.medplus.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.medplus.insurance.bean.PolicyQuestion;
import com.medplus.insurance.utilities.DBConnection;
import com.medplus.insurance.utilities.PolicyQuestionDBQueries;

public class PolicyQuestionDaoImpl implements PolicyQuestionDao {
	Connection conn;
	PreparedStatement pst;

	@Override
	public List<PolicyQuestion> getQuestionlist(int accountnumber) {
		List<PolicyQuestion> questionlist = new ArrayList<PolicyQuestion>();
		conn = DBConnection.open();
		try {
			pst = conn.prepareStatement(PolicyQuestionDBQueries.GETQUESLIST);
			pst.setInt(1, accountnumber);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				PolicyQuestion question = new PolicyQuestion();
				question.setQuesId(rs.getString(1));
				question.setQuesSeq(rs.getInt(2));
				question.setBusSegId(rs.getString(3));
				question.setQuesDesc(rs.getString(4));
				question.setQuesAns1(rs.getString(5));
				question.setAns1Weightage(rs.getInt(6));
				question.setQuesAns2(rs.getString(7));
				question.setAns2Weightage(rs.getInt(8));
				question.setQuesAns3(rs.getString(9));
				question.setAns3Weightage(rs.getInt(10));
				questionlist.add(question);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close();
		}
		return questionlist;
	}

	@Override
	public List<String> getAnswerList(List<Integer> ansWeightageList, String BusSegId, List<String>quesIdList) {
		conn = DBConnection.open();
		List<String> ansList = new ArrayList<String>();
		int i=0;
		for (int ansWeightage : ansWeightageList) {
			String ans = null;
			if (ansWeightage == 200) {
				try {
					pst = conn.prepareStatement(PolicyQuestionDBQueries.GETANS1);
					pst.setString(1, BusSegId);
					pst.setString(2, quesIdList.get(i));
					ResultSet rs = pst.executeQuery();
					while (rs.next())
						ans = rs.getString(1);
					ansList.add(ans);
					i++;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (ansWeightage == 400) {
				try {
					pst = conn.prepareStatement(PolicyQuestionDBQueries.GETANS2);
					pst.setString(1, BusSegId);
					pst.setString(2, quesIdList.get(i));
					ResultSet rs = pst.executeQuery();
					while (rs.next())
						ans = rs.getString(1);
					ansList.add(ans);
					i++;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (ansWeightage == 600) {
				try {
					pst = conn.prepareStatement(PolicyQuestionDBQueries.GETANS3);
					pst.setString(1, BusSegId);
					pst.setString(2, quesIdList.get(i));
					ResultSet rs = pst.executeQuery();
					while (rs.next())
						ans = rs.getString(1);
					ansList.add(ans);
					i++;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ansList;
	}

	@Override
	public List<String> getQuestIdList(List<String> questList,String busSegId) {
		conn = DBConnection.open();
		List<String> quesIdList = new ArrayList<String>();
		for (String quesDesc : questList) {
			String ans = null;
			try {
				pst = conn.prepareStatement(PolicyQuestionDBQueries.GETQUSIDLIST);
				pst.setString(1, quesDesc);
				pst.setString(2, busSegId);
				ResultSet rs = pst.executeQuery();
				while (rs.next())
					ans = rs.getString(1);
				quesIdList.add(ans);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return quesIdList;
	}
}
