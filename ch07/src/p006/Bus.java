package p006;

public class Bus extends Vehicle {
	public void info() {
		System.out.println("5명 이상이 탑승합니다.");
	}
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
