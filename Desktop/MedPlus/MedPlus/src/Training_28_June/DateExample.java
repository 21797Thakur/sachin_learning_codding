package Training_28_June;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {
	
public static void main(String[] args) throws ParseException {
	Date dt = new Date();
//	System.out.println("current date " + dt);
//	String dob ="27/06/2022";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm");
//	Date db = sdf.parse(dob);
	String date = sdf.format(dt);
	System.out.println(date);
	//System.out.println("DOB = " +db  );
//	String str ="2022-04-19";
//	LocalDate strDate = LocalDate.parse(str);
//	System.out.println("LocalDate = " + strDate);
	
}
}
