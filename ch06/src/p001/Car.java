package p001;

public class Car {
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	public Car(){
		
	}
	Car(String model){
//		this(model,"은색",250);
		this.model=model;
	}
	Car(String model,String color){
//		this(model,color,250);
		this.model=model;
		this.color=color;
	}
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	
	}
		
}
