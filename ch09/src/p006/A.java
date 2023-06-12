package p006;

public class A {
	void useB() {
		class B{
			int field=1;
			static int field2;
			public B() {
				System.out.println("B생성자 실행");
			}
			void method1() {
				System.out.println("B-method1 실행");
			}
		}
	}
}
