package p002;

public class Computer extends Calculator{
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle() 실행");
		return r*r*Math.PI;
	}
	
}
