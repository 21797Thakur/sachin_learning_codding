package com.medplus.insurance.dao;

import java.util.List;
import com.medplus.insurance.bean.PolicyQuestion;

public interface PolicyQuestionDao {
public List<PolicyQuestion> getQuestionlist(int accountnumber); 
public List<String> getAnswerList(List<Integer> ansWeightageList,String BusSegId,List<String>quesIdList);
public List<String> getQuestIdList(List<String> questList,String busSegId);
}
