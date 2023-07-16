package Training_23_June.Collection.TestArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayList {
public static void main(String[] args) {
	ArrayList<Object> items = new ArrayList<>();
	items.add("sachin");
	items.add(5400);
	items.add("medplus");
	items.add('k');
	items.add(null);
	items.add("sachin");
	items.add(504);
	
//items.contains(items)
//	System.out.println(items + " " + items.size());
//	items.add(2,"rrr");
//	System.out.println(items + " " + items.size());
//	items.remove(Integer.valueOf(5400));
//	items.indexOf(5400);
// @SuppressWarnings("rawtypes")
	ListIterator<Object> itr = items.listIterator();
	while(itr.hasNext())
	{
		Object obj = itr.next();
		if(obj instanceof Integer)
		System.out.println(obj);
	}
			
}
}
