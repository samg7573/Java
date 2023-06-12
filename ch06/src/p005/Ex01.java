package p005;

public class Ex01 {

	public static void main(String[] args) {
		Sj s1=new Sj("홍길동",80,90,88);
//		s1.setName("홍길동");
//		s1.setKor(80);
//		s1.setEng(90);
//		s1.setMat(88);
//		int tot=s1.getKor()+s1.getEng()+s1.getMat();
//		s1.setTot(tot);
//		float avg=(float)s1.getTot()/3;
//		s1.setAvg(avg);
		
		System.out.println("이름:"+s1.getName());
		System.out.println("국어:"+s1.getKor());
		System.out.println("수학:"+s1.getEng());
		System.out.println("영어:"+s1.getMat());
		System.out.println("총점:"+s1.getTot());
		System.out.println("평균:"+s1.getAvg());
	}

}
