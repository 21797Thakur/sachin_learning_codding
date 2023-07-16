package Training_27_June.StreamAp.Assignment.CollectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyString {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("sachin");
	list.add("amit");
	list.add("vijay");
	list.add("");
	list.add("");
	list.add("pranshu");
	list.add("ab");
	System.out.println("Q3. To remove all empty String from the list");
	List<String> emptyList = list.stream()
			.filter((p)->!p.isEmpty())
			.map((p)->p)
			.collect(Collectors.toList());
	emptyList.forEach((p)->System.out.println("\t"+ p));
	System.out.println("Q4. Extract a String lsit with string more that 3 char ?");
	List<String> list1 = list.stream()
			.filter((p)->p.length()<3)
			.map((p)->p)
			.collect(Collectors.toList());
	list1.forEach((p)->System.out.println("\t"+p));
}
}
