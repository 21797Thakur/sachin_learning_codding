package com.medplus.insurance.bean;

public class PolicyDetail {
private int	policynumber;
private String	questionid;
private String	Answer;
public PolicyDetail(int policynumber, String questionid, String answer) {
	super();
	this.policynumber = policynumber;
	this.questionid = questionid;
	Answer = answer;
}
public int getPolicynumber() {
	return policynumber;
}
public void setPolicynumber(int policynumber) {
	this.policynumber = policynumber;
}
public String getQuestionid() {
	return questionid;
}
public void setQuestionid(String questionid) {
	this.questionid = questionid;
}
public String getAnswer() {
	return Answer;
}
public void setAnswer(String answer) {
	Answer = answer;
}

}
