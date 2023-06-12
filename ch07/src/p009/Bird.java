package p009;

public class Bird extends Animal{



	@Override
	public void sound() {
		System.out.println("짹짹");
		
	}
	@Override
	public void disp() {
		System.out.println(this.name + ": " + this.age + "살 ----> " + "새");
		
	}
}
