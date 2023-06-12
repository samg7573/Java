package p007;

public class EMsungjuk implements Sungjuk{
	private int eng;
	private int math;
	
	
	public EMsungjuk(int eng, int math) {
		super();
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int total() {
		return eng+math;
	}

	@Override
	public float avg() {
		return total()/2.0f;
	}

	@Override
	public String check() {
		if(avg()>=70)return "합격";
		else return "불합격";
	}

}
