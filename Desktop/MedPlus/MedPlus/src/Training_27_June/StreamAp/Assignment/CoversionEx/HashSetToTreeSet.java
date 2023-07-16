package Training_27_June.StreamAp.Assignment.CoversionEx;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
public static void main(String[] args) {
	HashSet<String> listSet = new HashSet<String>();
	listSet.add("Sachin");
	listSet.add("Amit");
	listSet.add("Anil");
	listSet.add("Vijay");
	listSet.add("Pranshu");
	System.out.println(listSet);
	TreeSet<String> treeSet = new TreeSet<String>(listSet);
	System.out.println(treeSet);
}
}
