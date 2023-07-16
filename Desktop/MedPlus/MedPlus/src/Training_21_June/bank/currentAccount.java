package Training_21_June.bank;

public class currentAccount extends Account{
 private double overdraft;
public currentAccount(int num, double overdraft) {
	super(num);
	this.overdraft = overdraft;
}
public double getOverdraft() {
	return overdraft;
}
public void setOverdraft(double overdraft) {
	this.overdraft = overdraft;
}
public void withdraw(double overdraft)
{
	if(overdraft <= this.overdraft)
		super.withdraw(overdraft);
	else
		System.out.println(" the account overdraft limit exceeds ");
}
public String toString()
{
	return super.toString()+ " overdraft : " + overdraft + "\n";
}
}
