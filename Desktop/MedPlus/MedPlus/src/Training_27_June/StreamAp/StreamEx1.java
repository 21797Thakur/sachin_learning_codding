package Training_27_June.StreamAp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
public static void main(String[] args) {
	List<Product> productList= new ArrayList<Product>();
	productList.add(new Product(1,"HP Laptop",25000f));
	productList.add(new Product(2,"Dell Laptop",55000f));
	productList.add(new Product(3,"Lenevo Laptop",45000f));
	productList.add(new Product(4,"Sony Laptop",95000f));
	List<Product> plist2=productList.stream()
			.filter((p)->p.getPrice()>=30000)
			.map((p)->p)
			.collect(Collectors.toList());
	plist2.forEach((p)->System.out.println(p));
	List<Float> priceList = productList.stream()
			.map((p)->p.getPrice())
			.collect(Collectors.toList());
	System.out.println(priceList);
	System.out.println("max price "+Collections.max(priceList));
	System.out.println("max price " + Collections.min(priceList));	
}
}
