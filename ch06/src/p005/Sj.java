package p005;

public class Sj {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private float avg;
	public Sj(String name,int kor,int eng,int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.tot=this.kor+this.eng+this.mat;
		this.avg=(float)this.tot/3;
	}
	public String getName() { //source -> getter and setter
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
}
