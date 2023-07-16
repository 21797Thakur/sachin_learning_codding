package Training_28_June.WritingReadingObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObject {
public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("D:\\file\\CardInfo");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		CardInfo card1 = new CardInfo(1234535432542876L, 11, 2025, 432, "sachin");
		CardInfo card2 = new CardInfo(1234535430978776L, 12, 2035, 220, "Vijay");
		oos.writeObject(card1);
		oos.writeObject(card2);
		oos.close();
		System.out.println("creatd");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
