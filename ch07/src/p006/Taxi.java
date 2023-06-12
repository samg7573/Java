package p006;

public class Taxi extends Vehicle{
	public void info() {
		System.out.println("5명 이하가 탑승합니다.");
	}
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
