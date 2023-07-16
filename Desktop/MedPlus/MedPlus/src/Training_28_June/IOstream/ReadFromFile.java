package Training_28_June.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFromFile {
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("D:\\file\\sample.txt");
		FileOutputStream foa = new FileOutputStream("D:\\file\\sample1.txt");
		int c ;
		
		while((c=fis.read()) != -1)
		{
			System.out.print((char)c);
			foa.write(c);
		}
		fis.close();
		foa.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
