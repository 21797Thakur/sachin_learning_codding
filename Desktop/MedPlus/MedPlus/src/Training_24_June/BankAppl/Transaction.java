package Training_24_June.BankAppl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Transaction {
	String transType = "cash";
	ArrayList<Account> ac = new ArrayList<Account>();
	List<AccountStatement> acStatement = new ArrayList<AccountStatement>();

	public Transaction() {
	}

//	public Transaction(int acno, String name, int bal) {
//		super(acno, name, bal);
//	}

	public static String date() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String formatedDate = sdf.format(currentDate);
		return formatedDate;
	}

	public void createAccount(String name, int bal) {
		int acno = (int) (Math.random() * 10000);
		Account tr = new Account(acno, name, bal);
		AccountStatement statement = new AccountStatement(tr.getAcno(), date(), transType, "Account Creation", bal,
				tr.getBalance());
		ac.add(tr);
		acStatement.add(statement);
		System.out.println("account created successfully");
		System.out.println("Your account number is --- " + tr.getAcno());
	}

	public void deposit(int acno, int bal) {
		try {
			if (!(ac.stream().anyMatch((p) -> p.getAcno() == acno)))
				throw new AccountNotFoundException();
			Optional<Account> data = ac.stream().filter(ob -> ob.getAcno() == acno)
					.peek(ob -> ob.setBalance(ob.getBalance() + bal)).findFirst();
			acStatement.add(new AccountStatement(data.get().getAcno(), date(), transType, " Deposite ", bal,
					data.get().getBalance()));
			System.out.println("After deposit your balance---" + data.get().getBalance());

		} catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
//		
//		for (Account a : ac) {
//			if (acno == a.getAcno()) {
//				a.setBalance(a.getBalance() + bal);
//				AccountStatement statement = new AccountStatement(a.getAcno(), date(), transType, " Deposite ", bal,
//						a.getBalance());
//				acStatement.add(statement);
//
//				System.out.println("After deposit your balance---" + a.getBalance());
//				available = true;
//				break;
//			}
//		}
//		if (available == false) {
//			try {
//				throw new AccountNotFoundException();
//			} catch (AccountNotFoundException ac) {
//				System.out.println(ac.getMessage());
//			}
	}

	public void withdraw(int acno, int bal) {
		
		Optional<Account> data1 = ac.stream().filter(ob->ob.getAcno()==acno).findFirst();
		
		
		
		try {
			if (!(ac.stream().anyMatch((p) -> p.getAcno()==acno)))
				throw new AccountNotFoundException();
			Optional<Account> data = ac.stream().filter(ob -> ob.getAcno() == acno)
					.peek(ob -> ob.setBalance(ob.getBalance() - bal)).findFirst();
			acStatement.add(new AccountStatement(data.get().getAcno(), date(), transType, " Deposite ", bal,
					data.get().getBalance()));
			System.out.println("After deposit your balance---" + data.get().getBalance());
		} catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());

		}

//		boolean available = false;
//		for (Account a : ac) {
//			if (acno == a.getAcno()) {
//				if (bal > a.getBalance()) {
//					try {
//						throw new InsufficientBalanceException();
//					} catch (InsufficientBalanceException e) {
//						System.out.println(e.getMessage());
//					}
//					break;
//				} else {
//					a.setBalance(a.getBalance() - bal);
//					AccountStatement statement = new AccountStatement(a.getAcno(), date(), transType, " withdraw ", bal,
//							a.getBalance());
//					acStatement.add(statement);
//					System.out.println("After deposit your withdraw---" + a.getBalance());
//					available = true;
//					break;
//				}
//			}
//		}
//		if (available == false) {
//			try {
//				throw new AccountNotFoundException();
//			} catch (AccountNotFoundException ac) {
//				System.out.println(ac.getMessage());
//			}
//		}
	}

	public void checkBalance(int acno) {
		boolean available = false;
		for (Account a : ac) {
			if (acno == a.getAcno()) {
				System.out.println(a.getBalance());
				available = true;
				break;
			}
		}
		if (available == false) {
			try {
				throw new AccountNotFoundException();
			} catch (AccountNotFoundException ac) {
				System.out.println(ac.getMessage());
			}
		}
	}

	public void viewStatement(int acno) {
		boolean available = false;
		for (AccountStatement ac : acStatement) {
			if (ac.getAcno() == acno) {
				System.out.println(ac.getDate() + "----" + ac.getAcno() + "------" + ac.getTransactionType() + "-----"
						+ ac.getDescription() + "-----" + ac.getAmount() + "----" + ac.getAvailableBal());
				available = true;
			}
		}
		if (available == false) {
			try {
				throw new AccountNotFoundException();
			} catch (AccountNotFoundException ac) {
				System.out.println(ac.getMessage());
			}
		}
	}
}
