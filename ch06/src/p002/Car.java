package p002;

public class Car {
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model,String color){
		this(model,color,250);
	}
	
	public Car(String model, String color, int maxSpeed) { //source->using fields
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
