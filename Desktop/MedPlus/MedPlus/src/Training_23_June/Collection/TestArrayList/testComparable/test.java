package Training_23_June.Collection.TestArrayList.testComparable;

import java.util.TreeSet;

public class test {

@SuppressWarnings("unchecked")
public static void main(String[] args) {
	TreeSet<Integer> tr = new TreeSet<Integer>();
	tr.add(23);
	tr.add(21);
	tr.add(22);
	tr.add(24);
	tr.add(20);
	System.out.println(tr.ceiling(22));
	TreeSet<Integer> tr1 =new TreeSet<Integer>();
	tr1 = (TreeSet<Integer>) tr.clone();
	System.out.println(tr);
}

}
