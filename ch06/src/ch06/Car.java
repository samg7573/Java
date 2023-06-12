package ch06;

class Car { //멤버필드
	int speed;
	String color;
	String model;
	public Car(String c,String m){ //생성자-->초기화
		color=c;
		model=m;
	}
	Car(String model,String color,int maxSpeed){
		
	}
	public Car(){
		
	}
	void disp() { //메서드
		System.out.println("차 색상:"+color+"  차 모델:"+model);
	}
}
