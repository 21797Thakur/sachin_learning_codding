package Training_23_June.Collection.TestArrayList.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee("sachin",123,4000));
	emp.add(new Employee("sultan",124,6000));
	emp.add(new Employee("Vijay",125,7000));
	Collections.sort(emp);
//	System.out.println("Enter Name EmpId Sallery");
//		for(int i=0; i<4;i++)
//		{
//			String name =sc.next();
//			int empid = sc.nextInt();
//			int sal = sc.nextInt();
//			emp.add(new Employee(name, empid, sal));
//		}
		for(Employee e : emp)
		{
			System.out.println(e.getName() + " "+ e.getEmpID()+" " +e.getSallery());
		}
		sc.close();
 	}

}
