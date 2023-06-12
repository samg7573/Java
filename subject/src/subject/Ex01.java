package subject;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String[] spname=new String[5];
		int[] prices=new int[5];
		int[] count=new int[5];
		int[] total=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<spname.length;++i) { //입력
			System.out.println("상품명:");
			spname[i]=sc.nextLine();
			System.out.println("수량:");
			count[i]=Integer.parseInt(sc.nextLine());
			System.out.println("가격:");
			count[i]=Integer.parseInt(sc.nextLine());
			total[i]=count[i]*prices[i];
			
		}
		System.out.println("상품명 상품가격 상품수량 상품금액"); //출력
		for(int i=0;i<spname.length;++i) {
			System.out.println(spname[i]+" "+prices[i]+" "+count[i]+" "+total[i]);
		}
	}
	
}
