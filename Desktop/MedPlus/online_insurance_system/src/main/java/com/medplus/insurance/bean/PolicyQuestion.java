package com.medplus.insurance.bean;

public class PolicyQuestion {
	private String quesId;
	private int quesSeq;
	private String busSegId;
	private String quesDesc;
	private String quesAns1;
	private int ans1Weightage;
	private String quesAns2;
	private int ans2Weightage;
	private String quesAns3;
	private int ans3Weightage;

	public PolicyQuestion(String quesId, int quesSeq, String busSegId, String quesDesc, String quesAns1,
			int ans1Weightage, String quesAns2, int ans2Weightage, String quesAns3, int ans3Weightage) {
		super();
		this.quesId = quesId;
		this.quesSeq = quesSeq;
		this.busSegId = busSegId;
		this.quesDesc = quesDesc;
		this.quesAns1 = quesAns1;
		this.ans1Weightage = ans1Weightage;
		this.quesAns2 = quesAns2;
		this.ans2Weightage = ans2Weightage;
		this.quesAns3 = quesAns3;
		this.ans3Weightage = ans3Weightage;
	}

	public PolicyQuestion() {
		// TODO Auto-generated constructor stub
	}

	public String getQuesId() {
		return quesId;
	}

	public void setQuesId(String quesId) {
		this.quesId = quesId;
	}

	public int getQuesSeq() {
		return quesSeq;
	}

	public void setQuesSeq(int quesSeq) {
		this.quesSeq = quesSeq;
	}

	public String getBusSegId() {
		return busSegId;
	}

	public void setBusSegId(String busSegId) {
		this.busSegId = busSegId;
	}

	public String getQuesDesc() {
		return quesDesc;
	}

	public void setQuesDesc(String quesDesc) {
		this.quesDesc = quesDesc;
	}

	public String getQuesAns1() {
		return quesAns1;
	}

	public void setQuesAns1(String quesAns1) {
		this.quesAns1 = quesAns1;
	}

	public int getAns1Weightage() {
		return ans1Weightage;
	}

	public void setAns1Weightage(int ans1Weightage) {
		this.ans1Weightage = ans1Weightage;
	}

	public String getQuesAns2() {
		return quesAns2;
	}

	public void setQuesAns2(String quesAns2) {
		this.quesAns2 = quesAns2;
	}

	public int getAns2Weightage() {
		return ans2Weightage;
	}

	public void setAns2Weightage(int ans2Weightage) {
		this.ans2Weightage = ans2Weightage;
	}

	public String getQuesAns3() {
		return quesAns3;
	}

	public void setQuesAns3(String quesAns3) {
		this.quesAns3 = quesAns3;
	}

	public int getAns3Weightage() {
		return ans3Weightage;
	}

	public void setAns3Weightage(int ans3Weightage) {
		this.ans3Weightage = ans3Weightage;
	}

}
