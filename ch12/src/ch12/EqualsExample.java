package ch12;

public class EqualsExample {

	public static void main(String[] args) {
		Member m1=new Member("홍길동");
		Member m2=new Member("홍길동");
		Member m3=new Member("김철수");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
		if(m1.equals(m2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		if(m1.equals(m3)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}

}
