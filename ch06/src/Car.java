
public class Car {
	int speed;
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	static void simulate() {
		Car myCar=new Car();
		myCar.speed=200;
		myCar.run();
	}
	public static void main(String[] args) {
		simulate(); //static에 simulate있음

		Car myCar=new Car();
		myCar.speed=60;
		myCar.run();
	}

}
