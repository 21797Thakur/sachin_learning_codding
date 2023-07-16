package Training_24_June.BankAppl;

public class AccountNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotFoundException()
	{
		super("---Invalid account number please try again---");
	}

}
