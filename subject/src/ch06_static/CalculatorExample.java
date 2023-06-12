package ch06_static;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(2, 4);
		int result3 = Calculator.minus(4, 6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
