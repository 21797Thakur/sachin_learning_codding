package com.medplus.insurance.utilities;

public class AccountDBQueries {
	public static final String CREATEACCOUNT = "INSERT INTO ACCOUNT( accountnumber,"
			+ " InsuredName,insuredStreet, InsuredCity, InsuredState, InsuredZip, "
			+ "BusinessSegment,username) VALUES(?,?,?,?,?,?,?,?)";
	public static final String MAXACCNUMB = "SELECT MAX(ACCOUNTNUMBER) FROM ACCOUNT";
	public static final String ACCOUNTLIST = "SELECT ACCOUNTNUMBER,INSUREDNAME FROM ACCOUNT AS A WHERE A.ACCOUNTNUMBER NOT IN(SELECT ACCOUNTNUMBER FROM POLICY)";
	public static final String ACCTLISTBYROLE = "SELECT ACCOUNTNUMBER,INSUREDNAME FROM ACCOUNT AS A WHERE A.ACCOUNTNUMBER NOT IN(SELECT ACCOUNTNUMBER FROM POLICY) AND USERNAME=?";
	public static final String ACCTLIST="SELECT InsuredName, insuredStreet, InsuredCity, InsuredState, InsuredZip, BusinessSegment FROM ACCOUNT WHERE ACCOUNTNUMBER=?";
	public static final String CHCKACCT="SELECT EXISTS(SELECT USERNAME FROM ACCOUNT WHERE USERNAME=?)";
}
