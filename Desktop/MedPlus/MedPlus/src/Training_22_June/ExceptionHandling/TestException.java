package Training_22_June.ExceptionHandling;

public class TestException {
	public static void main(String[] args)  {
	
	int x=7;
	int y=2;
	try {
	System.out.println("result "+ x/y);
	Class.forName("Employee");
	}
	catch(ArithmeticException | ClassNotFoundException ae){
		ae.printStackTrace();
	}
	System.out.println("complete");
	}
}
