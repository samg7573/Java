package p007;

public class MultiPrint implements Print{
	private Sungjuk sj;
	public MultiPrint(Sungjuk sj) {
		this.sj=sj;
	}
	@Override
	public void print() {
		System.out.println("==========");
		System.out.println("총점="+sj.total());
		System.out.println("평균="+sj.avg());
		System.out.println("판정="+sj.check());
		System.out.println("==========");
		
	}

	@Override
	public void setInput(Sungjuk sj) {
		this.sj=sj;
		
	}

}
