package p007;

public class Main {

	public static void main(String[] args) {
		Sungjuk sj1=new KEMsungjuk(70,80,90);
		Sungjuk sj2=new EMsungjuk(77, 88);
		Print p1 = new OnePrint(sj1);
		Print p2 = new OnePrint(sj2);
		p1.print();
		p2.print();
		System.out.println("--------------------");
		Print p3=new MultiPrint(sj1);
		Print p4=new MultiPrint(sj2);
		p3.print();
		p4.print();
	}

}
