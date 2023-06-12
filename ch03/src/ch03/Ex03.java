package ch03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름=");
		
		String name=sc.nextLine();
		System.out.println("국어=");
		int kor=Integer.parseInt(sc.nextLine());

		System.out.println("수학=");
		int mat=Integer.parseInt(sc.nextLine());

		System.out.println("영어=");
		int eng=Integer.parseInt(sc.nextLine());
		System.out.print("국어="+kor);
		System.out.print("수학="+mat);
		System.out.print("영어="+eng);

		int tot=kor+mat+eng;
		int avg=tot/3;
		System.out.print("합계="+tot);
		System.out.print("평균="+avg);
		
	}

}
