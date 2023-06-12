package ch02;

public class Ex01 {

	public static void main(String[] args) {
		byte a=-128; //byte 1byte 9bit -128~127
		System.out.println(a);
		short b=32767; //short 2byte 16bit -32768~
		System.out.println(b);
		char c=65;//char 2byte(양수) 16bit 0~65535
		System.out.println(c);
		int d=-2100000000; //int 4byte 32bit -21억~21억
		System.out.println(d);
		long e=100L; //long 8byte -922경 ~ 922경
		System.out.println(e);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}
