package ch05;

public class Ex05 {

	public static void main(String[] args) {
//		String a="홍길동"; //a=b
//		String b="홍길동";
		String a=new String("홍길동"); //a!=b
		String b=new String("홍길동");
		System.out.println(a==b);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}
