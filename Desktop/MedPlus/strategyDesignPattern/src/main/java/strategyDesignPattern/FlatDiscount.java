package strategyDesignPattern;

public class FlatDiscount implements DiscountStrategy {

	public void giveDiscount() {
		System.out.println("Flat Discount");		
	}

}
