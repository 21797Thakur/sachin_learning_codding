package Training_21_June.task1;

public class Aeroplane implements Vehicle {

	@Override
	public void wheels() {
		System.out.println("Aeroplane has 6 wheels");
		
	}

	@Override
	public void engines() {
		System.out.println("Aeroplane has a 2 engines");
	}
public static void main(String[] args) {
	Vehicle b = new Aeroplane();
	b.wheels();
	b.engines();
}
}
