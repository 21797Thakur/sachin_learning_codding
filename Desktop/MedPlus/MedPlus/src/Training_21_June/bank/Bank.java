package Training_21_June.bank;

public class Bank {
	public static void main(String[] args) {
		Account acc[] = new Account[2];
		acc[0] = new savingAccount(12345, 2);
		acc[1] = new currentAccount(12346, 100);
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] instanceof savingAccount) {
				System.out.println("\t\t------------saving account-----------");
				savingAccount account = (savingAccount) acc[i];
				account.deposit(5000);
				account.addInterest();
				System.out.println("interest rate is " + account.getInterestRate());
				account.print();
			} else {
				System.out.println();
				System.out.println(" \t\t ------current account------- ");
				currentAccount account = (currentAccount) acc[i];
				account.deposit(50);
				account.withdraw(50);
				account.print();
			}
		}
	}
}
