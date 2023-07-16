package Training_27_June.StreamAp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiKeySorting {
public static void main(String[] args) {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	empList.add(new Employee(14,"kavya",9000,"del"));
	empList.add(new Employee(13,"Kavya",9000,"hyd"));
	empList.add(new Employee(16,"Ankita",8000,"bang"));
	empList.add(new Employee(15,"Bharat",8000,"mumb"));	
//	Comparator<Employee> sortedKeys= Comparator.comparing(Employee::getSalary)
//			.thenComparing(Employee::getName).th
//	enComparing(Employee::getLoc);
//	
//	List<Employee> empSortedList =empList.stream()
//									.sorted(sortedKeys)
//									.collect(Collectors.toList());
//	empSortedList.forEach((e)->System.out.println(e));
	Optional<Employee> result = empList.stream().filter(obj->obj.getCode()==13).peek(o->o.setSalary(21234)).findFirst();
	empList.forEach(p-> System.out.println(p));
//	Stream<Employee> st =  empList.values().stream();
	Optional<Employee> ss = empList.stream().filter(obj->obj.getCode()==13).findFirst();
	System.out.println(ss.get());
//	Optional
	
	
	
	
}
}
