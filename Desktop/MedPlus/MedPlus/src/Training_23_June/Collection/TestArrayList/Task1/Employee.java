package Training_23_June.Collection.TestArrayList.Task1;

public class Employee implements Comparable<Employee> {
private String name;
private int EmpID;
private int sallery;
public Employee(String name, int empID, int sallery) {
	super();
	this.name = name;
	EmpID = empID;
	this.sallery = sallery;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpID() {
	return EmpID;
}
public void setEmpID(int empID) {
	EmpID = empID;
}
public int getSallery() {
	return sallery;
}
public void setSallery(int sallery) {
	this.sallery = sallery;
}
@Override
public int compareTo(Employee o) {
//	int diff = ((Integer)EmpID).compareTo((Integer)o.getEmpID());
//	return diff;
	if(EmpID == o.getEmpID())
		return 0;
	else if(EmpID > o.getEmpID())
		return -1;
	else
		return 0;
	
}
}
