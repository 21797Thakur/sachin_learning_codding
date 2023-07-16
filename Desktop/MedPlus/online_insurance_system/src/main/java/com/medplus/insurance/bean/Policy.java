package com.medplus.insurance.bean;

public class Policy {
@Override
	public String toString() {
		return "Policy [policynumber=" + policynumber + ", policypremium=" + policypremium + ", accountnumber="
				+ accountnumber + "]";
	}
private int policynumber;
private double policypremium;
private int accountnumber;
public int getPolicynumber() {
	return policynumber;
}
public Policy(int policynumber, double policypremium, int accountnumber) {
	super();
	this.policynumber = policynumber;
	this.policypremium = policypremium;
	this.accountnumber = accountnumber;
}
public Policy() {
	// TODO Auto-generated constructor stub
}
public void setPolicynumber(int policynumber) {
	this.policynumber = policynumber;
}
public double getPolicypremium() {
	return policypremium;
}
public void setPolicypremium(double policypremium) {
	this.policypremium = policypremium;
}
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
}
