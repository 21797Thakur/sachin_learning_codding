package Training_18_July.Jdbc.task1;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class dbConnection {
	private static Connection con = null;
 public static Connection getConnection() throws SQLException
 {
	 if(con==null)
	 {
	 Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:mysql://localhost:3306/medplus";
		 con = DriverManager.getConnection(url, "root", "9Sachin@@");
	 }
	 else {
		 return con;
	 }
	 return con ;
 }
}
