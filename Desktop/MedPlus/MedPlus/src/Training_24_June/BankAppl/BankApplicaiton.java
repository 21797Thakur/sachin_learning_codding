package Training_24_June.BankAppl;

import java.util.Scanner;

public class BankApplicaiton {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tr = new Transaction();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		while (ch != 6) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Check balance");
			System.out.println("5. View statement");
			System.out.println("6. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter name: ");
				String nm = sc.next();
				System.out.println("Enter account opening balance:");
				int bal = sc.nextInt();
				tr.createAccount(nm, bal);
			}
				break;
			case 2: {
				System.out.println("enter account number for deposit");
				int acno = sc.nextInt();
				System.out.println("enter balance for deposit");
				int bal = sc.nextInt();
				tr.deposit(acno, bal);
			}
				break;
			case 3: {
				System.out.println("enter account number for withdraw");
				int acno = sc.nextInt();
				System.out.println("enter balance for withdraw");
				int bal = sc.nextInt();
				tr.withdraw(acno, bal);
			}
			break;
			case 4: {
				System.out.println("Enter the account number ");
				int acno = sc.nextInt();
				tr.checkBalance(acno);
			}
				break;
			case 5: {
				System.out.println("Enter account number for statement");
				int acno = sc.nextInt();
				tr.viewStatement(acno);
			}
			break;
			case 6:
			{
				break;
			}

			}
		}
		sc.close();
	}
}
