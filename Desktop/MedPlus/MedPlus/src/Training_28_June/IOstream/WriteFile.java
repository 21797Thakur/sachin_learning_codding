package Training_28_June.IOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) {
	try {
		FileOutputStream foa = new FileOutputStream("D:\\file\\sample.txt");
		for(int i=65;i<=90;i++)
		{
			foa.write(i);
		}
		System.out.println("created");
		foa.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
