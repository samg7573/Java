package p004;

import p004.A.B;

public class AExample {

	public static void main(String[] args) {
		A.B b=new A.B();
		System.out.println(b.field);
		b.method1();
		
		System.out.println(A.B.field2);
	}

}
