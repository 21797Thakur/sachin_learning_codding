package Task1;

public class Circle extends shape{
public Circle(double radius) {
		super(radius);
	}

public double area()
{
double result= 2 *Math.PI* (super.radius*super.radius) ;

return result ;
}

public static void main(String[] args) {
	shape c= new Circle(2);
	
	System.out.println("Area of circle " + c.area());
}
}
