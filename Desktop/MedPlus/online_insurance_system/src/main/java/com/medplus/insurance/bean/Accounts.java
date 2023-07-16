package com.medplus.insurance.bean;

public class Accounts {
	private int accountnumber;
	private String insuredname;
	private String insuredstreet;
	private String insuredcity	;
	private String insuredstate	;
	private int insuredzip;
	private String businesssegment;
	private String username;
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getInsuredname() {
		return insuredname;
	}
	public void setInsuredname(String insuredname) {
		this.insuredname = insuredname;
	}
	public String getInsuredstreet() {
		return insuredstreet;
	}
	public void setInsuredstreet(String insuredstreet) {
		this.insuredstreet = insuredstreet;
	}
	public String getInsuredcity() {
		return insuredcity;
	}
	public void setInsuredcity(String insuredcity) {
		this.insuredcity = insuredcity;
	}
	public String getInsuredstate() {
		return insuredstate;
	}
	public void setInsuredstate(String insuredstate) {
		this.insuredstate = insuredstate;
	}
	public int getInsuredzip() {
		return insuredzip;
	}
	public void setInsuredzip(int insuredzip) {
		this.insuredzip = insuredzip;
	}
	public String getBusinesssegment() {
		return businesssegment;
	}
	public void setBusinesssegment(String businesssegment) {
		this.businesssegment = businesssegment;
	}
	public String getUsername() {
		return username;
	}
	public Accounts(String insuredname, String insuredstreet, String insuredcity,
			String insuredstate, int insuredzip, String businesssegment, String username) {
		super();
//		this.accountnumber = accountnumber;
		this.insuredname = insuredname;
		this.insuredstreet = insuredstreet;
		this.insuredcity = insuredcity;
		this.insuredstate = insuredstate;
		this.insuredzip = insuredzip;
		this.businesssegment = businesssegment;
		this.username = username;
	}
	public Accounts() {
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
