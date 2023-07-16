package Training_27_June.StreamAp;

public class Employee {
	private int code;
	private String name;
	private int salary;
	private String loc;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Employee()
	{
		
	}public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", salary=" + salary + ", loc=" + loc + "]";
	}
	public Employee(int code, String name, int salary, String loc) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
		this.loc = loc;
	}
	

}
