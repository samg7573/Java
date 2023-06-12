package p008;

public class DriverExample2 {

	public static void main(String[] args) {
		Vehicle[] v=new Vehicle[5];
		v[0]=new Taxi(1);
		v[1]=new Taxi(2);
		v[2]=new Bus(3);
		v[3]=new Bus(4);
		v[4]=new Taxi(5);
		
		
		for (Vehicle i:v) {
			Driver driver = new Driver();
			driver.drive(i);
			if (i instanceof Bus) {
				Bus bus = (Bus)i;
				bus.checkFare();
			}else {
				Taxi taxi = (Taxi)i;
				taxi.call();
			}
			System.out.println("-------------------------");
			
		}
	}
	

}
