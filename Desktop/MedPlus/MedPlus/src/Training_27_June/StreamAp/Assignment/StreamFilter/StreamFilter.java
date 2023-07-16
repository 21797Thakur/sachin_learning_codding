package Training_27_June.StreamAp.Assignment.StreamFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamFilter {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("sachin");
	list.add("amit");
	list.add("vijay");
	list.add("");
	list.add("");
	list.add("pranshu");
	list.add("anil");
	System.out.println("Write a class to count the number of values in the string list whose length>4 ?");
	List<String> stringRange =list.stream()
			.filter((p)->p.length()>4)
			.map((p)->p)
			.collect(Collectors.toList());
	stringRange.forEach((p)->System.out.println("\t"+p));
	//2nd quesiton
	System.out.println("Q2. write a class to count for empty strings ?");
	List<String> emptyString = list.stream()
			.filter((p)->p.isEmpty())
			.map((p)->p)
			.collect(Collectors.toList());
	System.out.println("\t empty strings present in the list = "+emptyString.size());
	
}
}

