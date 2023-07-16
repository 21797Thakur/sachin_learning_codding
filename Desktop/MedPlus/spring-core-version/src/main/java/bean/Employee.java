package bean;

public class Employee {

private int empno;
private String empname;
private String loc;
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(int empno, String empname, String loc) {
	super();
	this.empno = empno;
	this.empname = empname;
	this.loc = loc;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public void start() {
	System.out.println("start int method");
}
public void stop()
{
	System.out.println("Destroy method ");
}
}
