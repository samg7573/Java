package p006;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Vehicle vehicle = bus;
		driver.drive(vehicle);
		if(vehicle instanceof Bus) {
			((Bus)vehicle).info();
		}
		System.out.println(vehicle instanceof Bus);
		
		
		Taxi taxi = new Taxi();
		vehicle = taxi;
		driver.drive(vehicle);
		if(vehicle instanceof Taxi) {
			((Taxi)vehicle).info();
		}else {
			((Bus)vehicle).info();
		}
		System.out.println(vehicle instanceof Taxi);
		taxi.info();

	}

}
