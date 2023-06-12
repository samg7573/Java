package ch05;

import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] spname=new String[5];
		int[] prices=new int[5];
		int[] count=new int[5];
		int[] total=new int[5];
		
		for(int i=0;i<spname.length;i++) {
			System.out.println("상품명:");
			String input=sc.nextLine();
			spname[i] = input;
			
			System.out.println("상품가격:");
			int input1=Integer.parseInt(sc.nextLine());
			prices[i] = input1;
			
			System.out.println("개수:");
			int input2=Integer.parseInt(sc.nextLine());
			count[i] = input2;
			
			System.out.println("상품명:"+spname[i]);
			System.out.println("상품가격:"+prices[i]+"원");
			System.out.println("개수:"+count[i]+"개");
			System.out.println("합계:"+(prices[i]*count[i])+"원");
		}
	}
}


