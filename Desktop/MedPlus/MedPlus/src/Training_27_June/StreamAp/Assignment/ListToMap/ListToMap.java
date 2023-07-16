package Training_27_June.StreamAp.Assignment.ListToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
public static void main(String[] args) {
	List<Book> bookList = new ArrayList<Book>();
	bookList.add(new Book(12, "Computer Networks"));
	bookList.add(new Book(13, "Operating System"));
	Map<Integer, Book> mapList=bookList.stream()
            .collect(Collectors.toMap(book -> book.getBookno(), book -> book));
	mapList.forEach((key,data)->System.out.println(key+" = "+data));	
}
}
