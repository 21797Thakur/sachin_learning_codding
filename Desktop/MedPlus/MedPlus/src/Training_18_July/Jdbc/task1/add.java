package Training_18_July.Jdbc.task1;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class add {
	static void addData() throws SQLException, ParseException
	{
		Scanner sc= new Scanner(System.in);
		Connection con =dbConnection.getConnection();
		System.out.println("Enter how many data want to enter");
		int n = sc.nextInt();
		int i=0;
		while(i<n)
		{
			String sql = "insert into Employee values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Enter EmpId");
			pst.setInt(1, sc.nextInt());
			System.out.println("Enter Employee Name");
			pst.setString(2, sc.next());
			System.out.println("Enter Employee Job");
			pst.setString(3, sc.next());
			System.out.println("Enter data of joining(dd/mm/yyyy");
			String dt = sc.next();
			java.util.Date date = new SimpleDateFormat("dd/mm/yyyy").parse(dt);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			pst.setDate(4, sqlDate);
			System.out.println("Enter Employee sallery");
			pst.setInt(5, sc.nextInt());
			i++;
			pst.executeUpdate();
		}
		sc.close();
	}
}
