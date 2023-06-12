package ch06_static;

//정적블록 예시
public class Television { //3개의 정적필드 활용 
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info=company+"-"+model;
	}
}
