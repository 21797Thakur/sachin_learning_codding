package Training_23_June.task1;

public class Transaction {
int balance=5000;
synchronized void withdraw(int amount)
{
	System.out.println("Available balance is " + this.balance);
	System.out.println("Trying to withdraw " + amount);
	if(this.balance < amount)
	{
		System.out.println("less amount waiting to deposite........");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.balance -= amount;
	System.out.println("withdraw completed........ current balance..... " +this.balance);
}
synchronized void deposite(int amount)
{
	System.out.println("Trying to depsite "+ amount);
	this.balance +=amount;
	System.out.println("Deposite completed ....... current balance... " + this.balance);
	notify();
}
}
