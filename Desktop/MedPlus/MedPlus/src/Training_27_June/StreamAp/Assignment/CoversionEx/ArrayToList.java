package Training_27_June.StreamAp.Assignment.CoversionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5, 4, 7, 2, 8 };
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : arr) {
			list.add(i);
		}
		list.forEach((p) -> System.out.println(p));
//--------------reverse the arraylist----------------
		System.out.println("\n\n reverse ArrayList---");
		Collections.reverse(list);
		list.forEach((p) -> System.out.println(p));
//-------------search an element from the ArrayaList--------------
		System.out.println("enter element for search from arraylist");
		int n = sc.nextInt();
		System.out.println(list.contains(n));
//-------------copy one arraylist to another--------------
		System.out.println("------------");
		List<Integer> copylist = new ArrayList<Integer>(list);
		copylist.forEach((p) -> System.out.println(p));
//----------------exteract portion of list----------
		System.out.println("------------");
		List<Integer>subList = list.subList(2, 4);
		subList.forEach((p)->System.out.println(p));
//-----------------Join two arraylist----------
		System.out.println("--------------");
		list.addAll(subList);
		list.forEach((p)->System.out.println(p));
	}
}
