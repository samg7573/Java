package ch12;
class A extends Object{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "클래스";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		String s="abcd";
		A a=new A();
		System.out.println(s);
		System.out.println(a.toString());

	}

}
