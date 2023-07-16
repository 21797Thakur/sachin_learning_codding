package Training_23_June.Collection.TestArrayList;

import java.util.ArrayList;

public class GenericArrayList {
public static void main(String[] args) {
	ArrayList<Integer> data = new ArrayList<Integer>();
	data.add(3400);
	data.add(null);
	data.add(650);
	data.add(43);
	for(Integer i: data)
	{
		System.out.println(i);
	}
	String str ="sachin";
	if(str instanceof String)
	{
		System.out.println(str instanceof String);
	}
}
}
