package java_example_180525;

public class ch6_25_AccountExample {

	public static void main(String[] args) {
		ch6_25_Account a = new ch6_25_Account();
		
		a.setBalance(10000);
		System.out.println("현재 잔고:"+a.getBalance());
		
		a.setBalance(-100);
		System.out.println("현재 잔고:"+a.getBalance());
		
		a.setBalance(2000000);
		System.out.println("현재 잔고:"+a.getBalance());
		
		a.setBalance(300000);
		System.out.println("현재 잔고:"+a.getBalance());
	}

}