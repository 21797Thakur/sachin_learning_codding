package Training_28_June.IOstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader itr = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(itr);
	System.out.println("Enter Employee code name sallery");
	int code = Integer.parseInt(bf.readLine());
	String name = bf.readLine();
	int sal = Integer.parseInt(bf.readLine());
	System.out.println(code+" "+name+" "+sal);
}
}
