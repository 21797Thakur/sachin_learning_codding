package com.medplus.insurance.utilities;

public class BusinessSegmentDBQueries {
public static final String GETBUSSEGID="SELECT BUS_SEG_ID FROM BUSINESS_SEGMENT WHERE BUS_SEG_NAME =(SELECT BUSINESSSEGMENT FROM ACCOUNT WHERE ACCOUNTNUMBER= ?)";
public static final String lSTBUSSEG = "SELECT BUS_SEG_NAME FROM BUSINESS_SEGMENT";
}
