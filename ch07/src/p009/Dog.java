package p009;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
		
		
	}

	@Override
	public void disp() {
		System.out.println(this.name + ": " + this.age + "살 ----> " + "개");
		
	}
}
