package Training_22_June.multithreading.task1;
public class BirthReservationApplication {
public static void main(String[] args) {
	Reservation reservation =new Reservation();
		Thread t1 = new Thread(reservation);
		Thread t2 = new Thread(reservation);
		Thread t3 = new Thread(reservation);
		Thread t4 =new Thread(reservation);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
}
}
