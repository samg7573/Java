package p002;

public class Errexample {
	public static void main(String[] args) {
	try {
	int value = Integer.parseInt("1oo");
	}catch(NumberFormatException e) {
		System.err.println("[에러 내용]");
		System.err.println(e.getMessage());
	}
}
}
