package p005;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi(); 
		driver.drive(bus);
		driver.drive(taxi);

	}

}
