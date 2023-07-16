package Training_24_June.BankAppl;

public class AccountStatement {
	private int acno;
	private String date;
	private String transactionType;
	private String description;
	private int amount;
	private int availableBal;
	public AccountStatement(int acno, String date, String transactionType, String description, int amount,
			int availableBal) {
		super();
		this.acno = acno;
		this.date = date;
		this.transactionType = transactionType;
		this.description = description;
		this.amount = amount;
		this.availableBal = availableBal;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAvailableBal() {
		return availableBal;
	}

	public void setAvailableBal(int availableBal) {
		this.availableBal = availableBal;
	}
}
