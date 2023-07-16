package Training_21_June.task1;

public class Bus implements Vehicle{

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("bus has 6 wheels");
	}

	@Override
	public void engines() {
		// TODO Auto-generated method stub
		System.out.println("bus has a one engine");
	}
	public static void main(String[] args) {
		Vehicle b = new Bus();
		b.wheels();
		b.engines();
	}

}
