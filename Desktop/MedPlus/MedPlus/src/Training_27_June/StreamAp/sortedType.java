package Training_27_June.StreamAp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sortedType {
public static void main(String[] args) {
	List<Product> productList= new ArrayList<Product>();
	productList.add(new Product(1,"HP Laptop",25000f));
	productList.add(new Product(2,"Dell Laptop",55000f));
	productList.add(new Product(3,"Lenevo Laptop",45000f));
	productList.add(new Product(4,"Sony Laptop",95000f));
	List<Product> sortedList = productList.stream().sorted((p1,p2)->{
		return p1.getpName().compareTo(p2.getpName());
	}).collect(Collectors.toList());
	for(Product p : sortedList)
	{
		System.out.println(p);
	}
}
}
