package Training_24_June;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapExercise {
public static void main(String[] args) {
	HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
	phoneBook.put("Medplus", 1234567);
	phoneBook.put("oracle", 987654321);
	phoneBook.put("hp", 123456712);
	phoneBook.put("dell", 123654322);
	phoneBook.put("Medplus", 765433567);
	System.out.println(phoneBook);
System.out.println(phoneBook.get("hp"));
Set<Entry<String, Integer>> set = phoneBook.entrySet();
Iterator<Entry<String, Integer>> itr = set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	Entry<String, Integer> entry = itr.next();
	System.out.println(entry.getKey()+ "------"+ entry.getValue());
}
}

}
