
public class Test {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	static {
		//field1=10; x
		//method1(); x
		field2=10;
		method2();
	}
	
	static void method3() {
		Test t=new Test();
		t.field1=10;
		t.method1();
	}
}
