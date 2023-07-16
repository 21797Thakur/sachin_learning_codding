package Training_22_June.multithreading;

public class TestThread {
public static void main(String[] args) {
	Number num = new Number();
	Number num1 =new Number();
	Thread t1 = new Thread(num);
	Thread t2 = new Thread(num);
	Thread t3 = new Thread(num1);
	t1.setName("A");
	t2.setName("B");
	t3.setName("C");
	t3.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
}
}
