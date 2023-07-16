package Training_21_June.task2;

public class CurrentAccount extends Account {
public CurrentAccount(int accountNumber, String name, int amount) {
		super(accountNumber, name, amount);
		
	}
final int overDraft = 50000;
int overdraft() {
	// TODO Auto-generated method stub
	return 0;
}
void deposit(int amount)
{
	balance += amount;
	 System.out.println("after deposited amount = " + balance );
}
void withdraw(int amount)
{
	int totalBal = balance + overDraft ;
	if(totalBal>amount)
	{
		System.out.println("your withdrwal limit is 50000");
		int res = amount - totalBal;
		System.out.println("after the withdrawl balance is" + res);
	}
	else
	{
	System.out.println("withdrawl amount should be less the " + totalBal);	
	}
}
}
