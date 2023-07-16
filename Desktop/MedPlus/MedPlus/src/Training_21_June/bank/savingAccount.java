package Training_21_June.bank;

public class savingAccount extends Account {
		private double interestRate;
		
	public savingAccount(int num, int interest) {
		   super(num);
		   this.interestRate = interest ;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void addInterest()
	   {
	      double interest = getBalance() * interestRate / 100;
	      deposit(interest);
	   }
	public String toString()
	{
		return super.toString()+ " interest : " +interestRate + "\n" ;
	}
	   
	}
