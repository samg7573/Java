package ch06;

public class Ex02 {

	public static void main(String[] args) {
		Car2 myCar=new Car2();
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현대속도: "+myCar.speed);
		
		myCar.speed=60;
		System.out.println("수정된 속도: "+myCar.speed);

	}

}
