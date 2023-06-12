package subject;

import java.util.Scanner;

class Sp{ //멤버 필드
	String spname;
	int price;
	int count;
	int total;
	Scanner sc=new Scanner(System.in);
	public Sp() { //생성자
		System.out.println("상품명:");
		spname=sc.nextLine();
		System.out.println("수량:");
		count=Integer.parseInt(sc.nextLine());
		System.out.println("가격:");
		count=Integer.parseInt(sc.nextLine());
		total=count*price;
	}
	public void disp() {
		System.out.println(spname+" "+price+" "+count+" "+total);
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Sp[] ss=new Sp[5];
		for(int i=0; i<ss.length;i++) {
			ss[i]=new Sp();
		}
		System.out.println("상품명 상품가격 상품수량 상품금액");
		for(int i=0; i<ss.length;i++) { // ----> for(Sp i:ss)
			ss[i].disp();
		}
	}

}
