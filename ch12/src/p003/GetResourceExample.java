package p003;

public class GetResourceExample {

	public static void main(String[] args) {
		Class clazz=Car.class;
		String p1=clazz.getResource("1111.jpg").getPath();
		String p2=clazz.getResource("images/p177.html").getPath();
		System.out.println(p1);
		System.out.println(p2);

	}

}
