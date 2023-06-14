package ch13;

public class GenExample {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgenct = new CarAgency();
		Car car=carAgenct.rent();
		car.run();

	}

}
