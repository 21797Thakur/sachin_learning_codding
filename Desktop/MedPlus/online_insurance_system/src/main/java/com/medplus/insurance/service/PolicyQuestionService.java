package com.medplus.insurance.service;

import java.util.List;

import com.medplus.insurance.bean.PolicyQuestion;

public interface PolicyQuestionService {
	List<PolicyQuestion> getQuestionlist(int accountnumber); 
//	List<String> getAnswerList(List<Integer> ansWeightageList,String BusSegId,String questId);
}
