package p007;

public class OnePrint implements Print {
	private Sungjuk sj;
	public OnePrint(Sungjuk sj) {
		this.sj=sj;
	}
	@Override
	public void print() {
		System.out.printf("총점=%d, 평균=%f, 판정=%s\n",sj.total(),sj.avg(),sj.check());
		
	}

	@Override
	public void setInput(Sungjuk sj) {
		this.sj=sj;
		
	}

}
