package Training_22_June.multithreading.task1;

import java.util.Scanner;

public class Reservation implements Runnable{
	public int available =10;
	public int birth ;
	public String name;
	@Override
	public synchronized void run() {
		Scanner sc =new Scanner(System.in);
		if(available > 0)
		{
			System.out.println("Please enter your name");
			name =sc.next();
			System.out.println("Please enter required birth");
			birth =sc.nextInt();
			if(available >=birth)
			{
			Thread.currentThread().setName(name);
			System.out.println("Welcome to IRCTC " + Thread.currentThread().getName());
			System.out.println("Birth confirmed successfully \n");
			available= available - birth ;
			}
			else
			{
				System.out.println("sorry these many births are not available");
			}
		}
		else
		{
			System.out.println("sorry births not available" );
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	

}
