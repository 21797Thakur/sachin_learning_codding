package Training_23_June.task1;

public class TestWaitNotify {
public static void main(String[] args) {
	Transaction trans = new Transaction();
//	Thread withdraw = new Thread() {pubic void run() {trans.withdraw(7000);}};
//	Thread deposit = new Thread() {pubic void run() {trans.withdraw(3000);}};
//	withdraw.start();
//	deposite.start();
	Runnable r1= ()->{
		trans.withdraw(6000);
	};
	Runnable r2 =() ->{
		trans.deposite(2000);
	};
	Thread withdraw = new Thread(r1);
	Thread deposite = new Thread(r2);
	withdraw.start();
	deposite.start();
	
}
}
