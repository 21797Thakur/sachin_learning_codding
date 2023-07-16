package Training_22_June.ExceptionHandling;

import java.util.Scanner;

public class CostomeExceptionExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int empcode = 453;
	int code= sc.nextInt();
	try {
		if(empcode!=code)
			throw new SampleException();
	}
		catch(SampleException se)
		{
			System.out.println("sample output");
		}
}
}
