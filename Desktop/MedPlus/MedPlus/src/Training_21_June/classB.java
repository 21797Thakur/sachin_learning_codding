package Training_21_June;

public class classB extends classA {
 void method()
{
	System.out.println("implemented abstract super class");
}
 public static void main(String[] args) {
	classA aa = new classB();
	aa.method();
}
}
