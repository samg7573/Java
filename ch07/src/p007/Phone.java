package p007;

public class Phone {
	String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
