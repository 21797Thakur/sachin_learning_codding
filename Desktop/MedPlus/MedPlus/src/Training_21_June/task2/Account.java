package Training_21_June.task2;

public  abstract class Account {
 protected int accountNumber;
 protected String name;
 protected int balance;


public Account(int accountNumber, String name, int amount) {
	super();
	this.accountNumber = accountNumber;
	this.name = name;
	this.balance = amount;
}

abstract void deposit(int amount);
abstract void withdraw(int amount);


}
