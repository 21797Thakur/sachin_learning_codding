package Task1;

public class Rectangle extends shape {
	public Rectangle(double length, double breadth)
	{
		super(length, breadth);
	}
	public double area()
	{
		double result = super.length * super.breadth;
		return result;
	}

	public static void main(String[] args) {
		Rectangle r= new Rectangle(5.2 , 2.5);
		System.out.println("Area of rectangle "+ r.area());
	}

}
