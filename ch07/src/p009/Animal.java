package p009;

import java.util.Scanner;

public abstract class Animal {
	protected String name;
	protected int age;
	private String kind;
	Scanner sc = new Scanner(System.in);
	
	public Animal() {
		System.out.print("이름=");
		this.name = sc.nextLine();
		System.out.print("나이=");
		this.age = Integer.parseInt(sc.nextLine());
		this.kind = kind;
//		System.out.print("종류=");
//		this.kind = sc.nextLine();
//		System.out.println(name + ": " + age + "살 ----> " + kind);
	}
	
	public abstract void disp(); 
//	{
//		System.out.println(name + " : " + age + "살");
//	}
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	
}