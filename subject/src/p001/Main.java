package p001;

public class Main {
	
	public static void main(String[] args) {
		Person p1=new Person("홍길동","대구",new Dog("덕구",3));
		Person p2=new Person("이영희","부산",new Cat("미미",4));
		System.out.println("이름   주소 동물종류  동물이름  동물나이");
		p1.disp();
		p2.disp();
	}
}
