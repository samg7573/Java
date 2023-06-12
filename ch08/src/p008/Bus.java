package p008;

public class Bus implements Vehicle{
	int num;
	public Bus(int i) {
		num=i;
	}
	@Override
	public void run() {
		System.out.println(num+"번 버스가 달립니다.");
		
	}
	public void checkFare() {
		System.out.println(num+"번 승차요금을 체크합니다.");
	}
	
}
