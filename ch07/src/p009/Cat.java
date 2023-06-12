package p009;

public class Cat extends Animal{
		
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
		
		
	}	
	@Override
	public void disp() {
		System.out.println(this.name + ": " + this.age + "살 ----> " + "고양이");
		
	}
}
