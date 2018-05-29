package java_example_180525;

public class ch6_25_Account {
	//상수 선언
	private static final int MIN_BALANCE=0;
	private static final int MAX_BALANCE=1000000;
	//필드 선언
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		//0<=balance<=1000000
		/*if(MIN_BALANCE<= balance && balance <= MAX_BALANCE)
		this.balance = balance;*/
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			return;
		}else {
			this.balance=balance;
		}
		
	}
}
