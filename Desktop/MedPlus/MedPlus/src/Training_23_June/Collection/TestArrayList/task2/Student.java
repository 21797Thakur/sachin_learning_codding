package Training_23_June.Collection.TestArrayList.task2;

public class Student {
private int regNumber;
private String studentName;
private String Group;
private int sub1;
private int sub2;
private int sub3;
@Override
public String toString() {
	return "Student [regNumber=" + regNumber + ", studentName=" + studentName + ", Group=" + Group + ", sub1=" + sub1
			+ ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
}
public void result(int reg)
{
	
	System.out.println();
}
public int getRegNumber() {
	return regNumber;
}

public void setRegNumber(int regNumber) {
	this.regNumber = regNumber;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getGroup() {
	return Group;
}

public void setGroup(String group) {
	Group = group;
}

public int getSub1() {
	return sub1;
}

public void setSub1(int sub1) {
	this.sub1 = sub1;
}

public int getSub2() {
	return sub2;
}

public void setSub2(int sub2) {
	this.sub2 = sub2;
}

public int getSub3() {
	return sub3;
}

public void setSub3(int sub3) {
	this.sub3 = sub3;
}

public Student(int regNumber, String studentName, String group, int sub1, int sub2, int sub3) {
	super();
	this.regNumber = regNumber;
	this.studentName = studentName;
	Group = group;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
}
}
