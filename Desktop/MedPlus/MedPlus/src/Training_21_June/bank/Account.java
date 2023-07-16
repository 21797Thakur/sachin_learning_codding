package Training_21_June.bank;

public class Account {
	private double balance;
	private int acctNum;
	
	public Account (int num)
	{
	balance = 0.0;
	acctNum = num;
	}
	public void deposit (double amt)
	{
	if (amt>0)
	balance += amt;
	else
	System.out.println("Can not deposit negative amount!");
	// add the amount to the balance only if positive
	}
	public void withdraw (double amt)
	{
	if (amt>0)
	{
	balance -=amt;
	System.out.println("amount withdrawl successful");
	}
	else
	System.out.println("Can not withdraw negative amount!");
	}
	public double getBalance()
	{
	return balance;
	}
	public int getAccountNumber()
	{
	return acctNum;
	}
	@Override
	public String toString()
	{
	return "Account number is " + acctNum + "\n the balance is " + balance + ".\n";
	}
	public final void print ()
	{
	System.out.println(toString());
	}
}
	
