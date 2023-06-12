package ch06_Overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
		
		double result1=myCalcu.areaRectangle(4);
		System.out.println("정사각형의 넓이: "+result1);
		
		double result2=myCalcu.areaRectangle(2, 3);
		System.out.println("직사각형의 넓이: "+result2);

	}

}
