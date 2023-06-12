package p004;

import p003.A;

public class D extends A{
	public D() {
		super();
	}
	public void method() {
		this.field="value";
		this.method();
		
	}
}
