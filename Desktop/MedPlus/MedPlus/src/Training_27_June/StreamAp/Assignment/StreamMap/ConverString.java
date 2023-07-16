package Training_27_June.StreamAp.Assignment.StreamMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverString {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("sachin");
	list.add("amit");
	list.add("vijay");
	list.add("pranshu");
	list.add("Anil");
	System.out.println("Q5. Convert String to uppercase and join them with comma");
	List<String> convertedList =list.stream()
			.map((p)->p.toUpperCase()+",")
			.collect(Collectors.toList());
	convertedList.forEach((p)->System.out.println(p));
	System.out.println("\n\n");
	List<Integer> listInteger = new ArrayList<Integer>();
	listInteger.add(4);
	listInteger.add(5);
	listInteger.add(3);
	listInteger.add(4);
	listInteger.add(5);
	List<Integer> sqrtList = listInteger.stream().distinct()
			.map((p)-> (p*p))
			.collect(Collectors.toList());
	sqrtList.forEach((p)->System.out.println(p));
	
	
}
}
