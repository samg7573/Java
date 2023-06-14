package p004;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행내용1");
	}
	@PrintAnnotation(value="*") //value는 생략가능
	public void method2() {
		System.out.println("실행내용2");
	}
	@PrintAnnotation(value="#",number=20)
	public void method3() {
		System.out.println("실행내용3");
	}
}
