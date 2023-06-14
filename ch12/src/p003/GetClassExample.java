package p003;

public class GetClassExample {

	public static void main(String[] args) {
		Class clazz=Car.class;
		Car car=new Car();
		System.out.println("패키지:"+clazz.getPackage().getName());
		System.out.println("클래스이름:"+clazz.getSimpleName());
		System.out.println("클래스전체이름:"+clazz.getName());

	}

}
