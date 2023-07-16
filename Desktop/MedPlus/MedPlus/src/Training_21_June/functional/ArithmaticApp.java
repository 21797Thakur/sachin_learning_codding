package Training_21_June.functional;

public class ArithmaticApp{
public static void main(String[] args) {
	Arithmetic art =(x,y)->{
		int result =x+y ;
		
		return result;
	};
	System.out.println(art.add(5,6));
}
}
