package java_example_180524;

public class ch6_21_ExcerciseExample {

	public static void main(String[] args) {
		//새 예금계좌를 만든다
		ch6_21_Excercise acct = new ch6_21_Excercise();
		
		//계좌의 예금주를 '홀길동'으로 한다
		acct.setName("홍길동");
		
		//계좌 번호는 101으로 한다.
		acct.setAccountNumber(101);
		
		//계좌의 초기 입금액은 10,000원이다
		acct.setBalance(10000);
		
		//계좌에 3000원 입금한다.
		acct.deposit(3000);
		
		//계좌에서 5000원을 출금한다.
		acct.withdraw(5000);
		
		//계좌의 내역을 출력한다.
		acct.result();
	}

}
