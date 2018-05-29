package java_example_180524;

public class ch6_21_Excercise {
	private String name;
	private int accountNumber;
	private int balance;
	private int deposit;
	private int withdraw;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int deposit) {
		this.deposit = deposit;
	}
	
	public void withdraw(int withdraw) {
		this.withdraw=withdraw;
	}
	public void result() {
		int sum=getBalance();
		sum=getBalance()+deposit-withdraw;
		System.out.println("계좌잔고:"+getBalance());
		System.out.println("입금액"+deposit);
		System.out.println("출금액:"+withdraw);
		System.out.println("---------------------");
		System.out.println("예금주 이름:"+getName());
		System.out.println("계좌번호:"+getAccountNumber());
		System.out.println("잔고:"+sum);
		/*sum=getBalance()+deposit-withdraw;*/
	}
}
