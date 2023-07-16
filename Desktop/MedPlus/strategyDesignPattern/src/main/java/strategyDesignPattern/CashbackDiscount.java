package strategyDesignPattern;

public class CashbackDiscount implements DiscountStrategy {

	public void giveDiscount() {
		System.out.println("Cashback Discount");
	}

}
