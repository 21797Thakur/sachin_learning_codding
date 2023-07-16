package Training_21_June.task2;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int balance;
	static void openingAccount()
	{
		System.out.println("enter the account holder name");
		name = sc.next();
		System.out.println("minimum account opening amount (should be greater then 2500)");
		balance = sc.nextInt();
	}
	public static void main(String[] args) {
		SavingAccount acc[] = new SavingAccount[1];
		Account crr[] = new CurrentAccount[1];
		
		System.out.println("-------Sultan Bank-------");
		int i=0;
		while(i<3) {
		System.out.println("1. account opening");
		System.out.println("2. account close");
		byte n = sc.nextByte();
		switch(n)
		{
		case 1:{
			System.out.println("1. Saving Acount");
			System.out.println("2. Current Account");
			int r = sc.nextInt();
			switch(r)
			{
			case 1:
			{
				openingAccount();
				int accountNumber = (int) (Math.random()*1000);
				acc[i] = new SavingAccount(accountNumber,name,balance);
				i++;
			}break;
			
			case 2:
			{
				openingAccount();
				int accountNumber = (int) (Math.random()*1000);
				crr[i] = new CurrentAccount(accountNumber,name,balance);
				i++;
			}break;
			}
		}
		break;
		case 2:
		{
			System.out.println("Enter Account Id");
			int account = sc.nextInt();
		}
		}
		acc[0].deposit(4500);
		acc[0].withdraw(1000);
		acc[0].addInterest();
		}
}
}
