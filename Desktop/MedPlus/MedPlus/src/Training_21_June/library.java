package Training_21_June;

public class library extends student {
private int duedate;
public library(int duedate) {
	super();
	this.duedate = duedate;
}
public void display()
{
	System.out.println("subclass method");
}
public static void main(String args[])
{
	student st= new student();
	st.display();
//	library lb =(library) new student();
//	System.out.println(lb.duedate);
	
	
}
}
