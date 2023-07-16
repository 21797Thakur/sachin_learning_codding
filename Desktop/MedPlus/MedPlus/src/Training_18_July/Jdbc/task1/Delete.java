package Training_18_July.Jdbc.task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void deleteData() throws SQLException{
	Scanner sc = new Scanner(System.in);
	Connection con =dbConnection.getConnection();
	String sql = "delete from employee where empid =?";
	PreparedStatement pst = con.prepareStatement(sql);
	System.out.println("Enter employee id for update sallery");
	pst.setInt(1, sc.nextInt());
	sc.close();
	}
}
