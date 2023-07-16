package Training_24_June.BankAppl;

public class Account {
private int acno ;
private String custName ;
private int balance;
public Account()
{
	
}
public Account(int acno, String custName, int balance) {
	super();
	this.acno = acno;
	this.custName = custName;
	this.balance = balance;
}

@Override
public String toString() {
	return "Account [acno=" + acno + ", custName=" + custName + ", balance=" + balance + "]";
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}


}
