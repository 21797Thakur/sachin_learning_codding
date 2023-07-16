package Training_18_July.Jdbc.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewALL {
public static void employeeData() throws SQLException
{
	Connection con = dbConnection.getConnection();
	String sql = "select * from Employee";
	PreparedStatement pst = con.prepareStatement(sql);
	ResultSet rs = pst.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" " + rs.getString(3)+" "+ rs.getDate(4)+" " +rs.getInt(5));
	}
}
}
