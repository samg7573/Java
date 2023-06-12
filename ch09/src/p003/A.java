package p003;

public class A {
	static class B{
		
	}
	B field1=new B();
	static B field2=new B();
	public A() {
		B b= new B();
	}
	void method1() {
		B b = new B();
	}
	static void method2() {
		B b = new B();
	}
}
