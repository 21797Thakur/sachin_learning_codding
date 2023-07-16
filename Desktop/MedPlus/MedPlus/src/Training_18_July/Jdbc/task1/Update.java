package Training_18_July.Jdbc.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Update {
public static void updateData() throws SQLException
{
	Scanner sc = new Scanner(System.in);
	Connection con =dbConnection.getConnection();
	String sql = "update Employee set sallery =? where empid =?";
	PreparedStatement pst = con.prepareStatement(sql);
	System.out.println("Enter employee id for update sallery");
	pst.setInt(2, sc.nextInt());
	System.out.println("Enter Sallery for employee");
	pst.setInt(1, sc.nextInt());
	pst.executeUpdate();
	sc.close();
}
}
