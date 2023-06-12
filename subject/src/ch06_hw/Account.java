package ch06_hw;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	void account() {
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public static int getMinBalance() {
			return MIN_BALANCE;
		}
		public static int getMaxBalance() {
			return MAX_BALANCE;
		}
	}
	
}
