package Training_18_July.Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import Training_18_July.Jdbc.task1.dbConnection;

public class callablestmt {
public static void main(String[] args) throws SQLException {
	Connection con = dbConnection.getConnection();
	CallableStatement cst = con.prepareCall("{call sample_proc(?,?)}");
	cst.setInt(1, 20);
	cst.setString(2,"software");
	cst.executeUpdate();
	System.out.println("done");
}
}
