package p002;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		int a = System.in.read()-48;
		System.in.read();
		System.in.read();
		
		int b = System.in.read()-48;
		System.out.print(a+b);

	}

}
