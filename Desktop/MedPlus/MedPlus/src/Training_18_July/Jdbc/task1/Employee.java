package Training_18_July.Jdbc.task1;

import java.sql.*;
import java.text.ParseException;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) throws SQLException, ParseException {
		Scanner sc = new Scanner(System.in);
		Connection con = dbConnection.getConnection();
		boolean b = false;
		try {
			String sql = "select * from Employee";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.execute();
		} catch (Exception e) {
			b = true;
		}
		if (b == true) {
			String sql = "Create table Employee"
					+ "(EmpId int ,EmpName varchar(30), Job varchar(20) , DOJ date ,sallery int)";
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			b = false;
			System.out.println("table created");
		}
		System.out.println("Enter your choice");
		int n = 0;
		while (n < 5) {
			System.out.println("1. add data in employee table");
			System.out.println("2. update data in employee table");
			System.out.println("3. delete a employee data");
			System.out.println("4. see all data from table");
			System.out.println("5. see one employee data");
			n = sc.nextInt();
			switch (n) {
			case 1:
				add.addData();
				break;
			case 2:try {
				Update.updateData();}
			catch (Exception e) {
			
			}
				break;
			case 3:
				Delete.deleteData();
				break;
			case 4: ViewALL.employeeData();
				break;
			
			}
		}
		sc.close();
	}
}
