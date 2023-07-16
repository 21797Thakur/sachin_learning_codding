package Training_24_June.BankAppl;

public class InsufficientBalanceException extends RuntimeException {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InsufficientBalanceException()
{
	super("---- Balance is insufficient ----");
}
}
