package p007;

public class KEMsungjuk implements Sungjuk{
	private int kor;
	private int eng;
	private int math;
	public KEMsungjuk(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int total() {
		return kor+eng+math;
	}

	@Override
	public float avg() {
		return total()/3.0f;
	}

	@Override
	public String check() {
		if(avg()>=80) return "합격";
		else return "불합격";
	}

}
