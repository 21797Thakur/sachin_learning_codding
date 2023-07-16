package Training_27_June.StreamAp.Assignment.CoversionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class SortHashmap {
public static void main(String[] args) {
	Map<Integer, String> map =new HashMap<Integer, String>();
	map.put(12, "sachin");
	map.put(11, "amit");
	map.put(13, "vijay");
	map.put(15, "pranshu");
	Set<Entry<Integer, String>> set = map.entrySet();
	Iterator<Entry<Integer, String>> itr = set.iterator();
	while(itr.hasNext())
	{
		//System.out.println(itr.next());
		Entry<Integer, String> entry = itr.next();
		System.out.println(entry.getKey()+ "------"+ entry.getValue());
	}

}
}
