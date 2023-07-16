package Training_23_June.Collection.TestArrayList.Task1;

import java.util.*;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee("Vijay", 1234, 9000));
		emp.add(new Employee("sachin", 12, 5000));
		emp.add(new Employee("asdf", 123, 5000));
//emp.forEach((emp1)->{
//		System.out.println(emp1.getName()+" "+ emp1.getEmpID()+" " +emp1.getSallery());
//}
//);
		for (Employee e : emp) {
			System.out.println(e.getName() + " " + e.getEmpID() + " " + e.getSallery());
		}
	}
}
