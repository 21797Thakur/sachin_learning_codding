package Training_27_June.StreamAp.Assignment.ListToMap;

public class Book {
private int bookno;
private String book ;
public int getBookno() {
	return bookno;
}
public void setBookno(int bookno) {
	this.bookno = bookno;
}
@Override
public String toString() {
	return "Book [bookno=" + bookno + ", book=" + book + "]";
}
public Book(int bookno, String book) {
	super();
	this.bookno = bookno;
	this.book = book;
}
public String getBook() {
	return book;
}
public void setBook(String book) {
	this.book = book;
}
}
