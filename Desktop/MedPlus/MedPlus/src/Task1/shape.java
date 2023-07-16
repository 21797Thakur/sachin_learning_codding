package Task1;

public  abstract class shape {
protected double length;
protected double breadth;
protected double radius;

public shape(double radius) {
	super();
	this.radius = radius;
}

public shape(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public abstract double area();
}
