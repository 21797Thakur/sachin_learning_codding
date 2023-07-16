package Training_18_July.Jdbc;

import java.sql.*;

import java.sql.SQLException;
import java.util.Date;

import com.mysql.jdbc.Driver;

public class TestDate{
	public static void main(String[] args) throws SQLException {
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	String url = "jdbc:mysql://localhost:3306/medplus";
	Connection con = DriverManager.getConnection(url, "root", "9Sachin@@");
	String sql = "insert into testDate values(?,?)";
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setString(1, "sachin");
	Date dt = new Date();
	java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
	pst.setDate(2, sqlDate);
	pst.executeUpdate();
	System.out.println("done");
	}
}
