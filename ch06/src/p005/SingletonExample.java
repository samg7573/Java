package p005;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton singleton1=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		if(singleton1==singleton2) {
			System.out.println("같은 Singleton객체입니다.");
		}else {
			System.out.println("다른 Singleton객체입니다.");
		}

	}

}
