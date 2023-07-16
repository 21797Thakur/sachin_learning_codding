package Training_18_July.Jdbc;

import java.sql.*;
import java.util.Scanner;
import com.mysql.jdbc.Driver;

public class TestConnection {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/medplus";
		Connection con = DriverManager.getConnection(url, "root", "9Sachin@@");
//		String qry = "insert into student values(?,?,?)";
//		PreparedStatement prst = con.prepareStatement(qry);
//		for (int i = 0; i < 2; i++) {
//			System.out.println("enter student Regno.");
//			prst.setInt(1, sc.nextInt());
//			System.out.println("Enter Student name");
//			prst.setString(2, sc.next());
//			System.out.println("Enter Student Total Marks");
//			prst.setString(3, sc.next());
//			int res= prst.executeUpdate();
//			System.out.println(res);
//		}
		String qry = "create table st( name varchar(30)";
		String qry1 = "select * from student"; 
		PreparedStatement prst = con.prepareStatement(qry);
//		ResultSet rs = prst.executeQuery();
//		ResultSetMetaData rsclmn = rs.getMetaData();
//		for(int i=1; i<=rsclmn.getColumnCount(); i++)
//			System.out.print(rsclmn.getColumnName(i) + " ");
//		System.out.println("\n-----------------------");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1) + " "+ rs.getString(2)+ " "+rs.getString(3));
//		}
		prst.executeUpdate();
		System.out.println("done");
		con.close();
		sc.close();
	}
}
