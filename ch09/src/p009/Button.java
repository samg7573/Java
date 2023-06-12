package p009;

public class Button {
	private ClickListener clickListener;
	public static interface ClickListener{
		void onClick();
	}
	public void setClickListener(ClickListener clickListener) {
		this.clickListener=clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}
