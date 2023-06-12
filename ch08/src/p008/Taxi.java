package p008;

public class Taxi implements Vehicle{
	int num;
	public Taxi(int i) {
		num=i;
	}
	@Override
	public void run() {
		System.out.println(num+"번 택시가 달립니다.");
		
	}
	public void call() {
		System.out.println(num+"번 택시를 호출합니다.");
	}
}
