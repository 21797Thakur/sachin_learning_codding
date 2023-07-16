package com.medplus.insurance.utilities;
public class UserRoleDBQueries {
public static final String CREATEUSER ="INSERT INTO USERROLE VALUES(?,?,?) ";
public static final String CHECKUSER ="SELECT role_code FROM USERROLE WHERE USERNAME=? AND PASSWORD=?";

}
