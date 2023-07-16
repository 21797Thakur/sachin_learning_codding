package Training_22_June.multithreading;

public class Number implements Runnable{

@Override
public synchronized void run() {
	// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=5;i++)
	{
		System.out.print(i+ " ");
	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
