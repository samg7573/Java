package ch06_Instance;

public class Car { 
	//필드 선언
	String model;
	int speed;
	
	//생성자 선언
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		setSpeed(100); //void 생략가능
		System.out.println(model+"가 달립니다. (시속:"+speed+"km/h");
	}
}
