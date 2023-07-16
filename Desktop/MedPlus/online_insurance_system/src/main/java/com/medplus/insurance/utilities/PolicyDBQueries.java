package com.medplus.insurance.utilities;

public class PolicyDBQueries {
	public static final String ADDPOLICY = "INSERT INTO POLICY(PolicyNumber, PolicyPremium, accountnumber) VALUES(?,?,?)";
	public static final String MAXPOLNUM = "SELECT MAX(PolicyNumber) FROM Policy";
	public static final String GETPOLNUM = "SELECT POLICYNUMBER FROM POLICY WHERE ACCOUNTNUMBER=?";
	public static final String ADDPOLDETAIL = "INSERT INTO POLICYDETAILS( answer,PolicyNumber, QuestionId) VALUES(?,?,?)";
	public static final String GETPOLLIST = "SELECT PolicyNumber, PolicyPremium, accountnumber FROM POLICY";
	public static final String GETPOLLISTBYUSRNM = "SELECT PolicyNumber, PolicyPremium, accountnumber FROM POLICY WHERE ACCOUNTNUMBER IN (SELECT accountnumber FROM ACCOUNT WHERE username=?)";
	public static final String GETACCNUM ="SELECT ACCOUNTNUMBER FROM POLICY WHERE POLICYNUMBER=?";
}