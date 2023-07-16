package Training_21_June.task2;

public class SavingAccount extends Account{

   final int interest = 4 ;

	public SavingAccount(int accountNumber, String name, int amount) {
		super(accountNumber, name, amount);
		// TODO Auto-generated constructor stub
	}
	void deposit(int amount)
	{
		balance += amount;
		 System.out.println("after deposited amount = " + balance );
	}
	void withdraw(int amount)
	{
		if(amount<balance)
		{
		balance -= amount;
		System.out.println("amount withdrawn successfully = " + balance);
		}
		else
		{
			System.out.println("low balance");
		}
	}
	
	void addInterest()
	{
		balance += balance * 4/100 ;
		System.out.println("after adding interest balance is = " + balance);
	}
	}

