package Training_28_June.WritingReadingObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject {
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("D:\\file\\CardInfo");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj ;
		while((obj = ois.readObject())!=null)
		{
			CardInfo card = (CardInfo) obj;
			System.out.println(card);
		}
		ois.close();
	} catch (IOException | ClassNotFoundException e) {
	}
	
}
}
