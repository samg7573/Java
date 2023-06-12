package ch08;

public class Ex01 {

	public static void main(String[] args) {
		
		RemoteControl re;
		re = new Television();
		re.turnOn();

		re =new Audio();
		re.turnOn();
		
		re = new Computer();
		re.turnOn();
		System.out.println("리모콘 최대 볼륨: "+RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨: "+RemoteControl.MIN_VOLUME);
	}

}
