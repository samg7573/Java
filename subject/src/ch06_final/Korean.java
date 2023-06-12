package ch06_final;

public class Korean {
	//인스턴스 final필드 선언
	final String nation = "대한민국";
	final String ssn; //필드에서 선언은 했으나 후에 입력해야 되므로 초기값은 주지않았음
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
