package p005;
class A{
	int x=5;
	//int y=6;
}
class B extends A{
	int y=8;
	int z=9;
}

public class Main {
	public static void main(String[] ar) {
		A r = new B();
		System.out.println(r.x);
//		System.out.println(r.y);
		B k =(B)r;
		System.out.println(k.z);
		System.out.println(k.x);
		System.out.println(k.y);
	}
	
}
