package java_example_180525;

import java.util.Scanner;

public class ch6_26_AccountExample {

private static final String String = null;
//account 클래스 타입의 account 배열 선언 
//메인 안의 모든 반목문에서 동등하게 쓰이기 위해 클래으밑단에 선언해줌(전역변수같은 느낌)
private static ch6_26_Account[] account = new ch6_26_Account[100];
private static	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.println("===========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("===========================================");
			System.out.println("선택>>");
			int s=0;
			s=scan.nextInt();
			//메소드를 호출하는 부분
			if(s==1) {
				createch6_26_Account();
			}else if(s==2) {
				ch6_26_AccountList();
			}else if(s==3) {
				deposit();
			}else if(s==4) {
				withdraw();
			}else if(s==5) {
				System.out.println("종료합니다.");
				break;}
		}
	}
	//계좌 생성을 위한 createch6_26_Account() 메소드
	//계좌번호, 계좌주, 초기입금액을 입력받고 계좌가 생성되엇습니다.출력
	private static void createch6_26_Account() {
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		System.out.print("계좌 번호:");
		String ano = scan.next();//계좌번호 입력을 위한 변수
		System.out.print("계좌주:");
		String name = scan.next();//계좌주 입력을 위한 변수
		System.out.print("초기 입금액:");
		int balance=scan.nextInt();//초기 입금액을 위한 변수
		//입력받은 값을 이용하여 ch6_26_Account 클래스에 대한 객체 생성 
		ch6_26_Account ac = new ch6_26_Account(ano,name,balance);
		//입력받은 값을 배열 변수에 하나씩 저장
		for(int i=0;i<account.length;i++) {
			if(account[i] == null) {
				account[i]=ac;
				//ac.getAno(), ac.getName(), ac.getBalance()
				System.out.println("계좌가 생성 완료되었습니다.");
				break;
			}
		}
	}
	//계좌목록을 보기 위한 리스트
	//입력된 고객의 계좌번호, 계좌주, 잔액을 모두 보여줌
	private static void ch6_26_AccountList() {
		System.out.println("계좌 목록");
		for(int i=0;i<account.length;i++) {
			//ch6_26_Account 클래스 타입의 ac변수 선언
			//account 배열에 있는 내용을 담는다.
			ch6_26_Account ac = account[i];
			if(ac != null) {
				System.out.println(i+1+"번째 고객 정보");
				System.out.println("----------------");
				System.out.println("계좌번호:"+ac.getAno());
				System.out.println("고객명:"+ac.getName());
				System.out.println("잔고:"+ac.getBalance());
				System.out.println("----------------");
			}
		}
	}
	//예금처리를 위한 메소드
	//입금하고자 하는 계좌의 게좌번호, 입금액을 입력받아서
	//계좌번호 일치여부를 판단하고 기존 잔액에 입금액을 더해서 잔액으로 만든다.
	private static void deposit() {
  		System.out.println("입급할 계좌를 입력하세요");
		String ano = scan.next();
		for(int i=0;i<account.length;i++) {
			//ch6_26_Account ac = account[i];
			ch6_26_Account ac = findAccount(ano);
			if(ano.equals(ac.getAno())) {
			System.out.println("입금할 금액을 입력해주세요:");
			int balance = scan.nextInt();
			if(ac != null) {
				ac.setBalance(balance+ac.getBalance());
				System.out.println("예금에 성공하셨습니다.");
				System.out.println("잔액은"+ac.getBalance()+"입니다.");
				break;
			}
		}
			else 
				{System.out.println("계좌가 일치하지않습니다.");
				return ;}
		}
	}
	private static void withdraw() {
		System.out.println("출금할 계좌를 입력하세요");
		String ano = scan.next();
		for(int i=0;i<account.length;i++) {
			ch6_26_Account ac = account[i];
			if(ano.equals(ac.getAno())) {
			System.out.println("출금할 금액을 입력해주세요:");
			int balance = scan.nextInt();
			if(ac != null) {
				ac.setBalance(ac.getBalance()-balance);
				if(ac.getBalance()<0) {
					System.out.println("잔고가 부족합니다.");
					ac.setBalance(balance+ac.getBalance());
					System.out.println("현재 잔액은"+ac.getBalance()+"입니다.");
				}
				break;
			}
		}
			else
				{System.out.println("계좌가 일치하지않습니다.");
				return;}
		}
	} 
	//Account 배열에서 계좌와 동일한 Account 객체 찾기
	//고객이 입력한 계좌번호와 저장되어 있는 계좌번호에 대해 일치여부를 판단하는 메소드
	//매개변수 ano
	//리턴타입 : ch6_26_Account 클래스
	private static ch6_26_Account findAccount(String ano) {
		ch6_26_Account ac=null;
		//ano와 일치하는 계좌번호를 찾기위해 배열의 모든 내용을 반복문을 통해 검색
		for(int i=0;i<account.length;i++) {
			if(account[i] != null) {
				//배열에 저장되어 있는 계좌번호를 임시로 저장하기위한 변수
				String dbAno = account[i].getAno();
				if(dbAno.equals(ano)) {
					//일치하면 해당 인덱스레 있는 내용을 ac 변수에 저장
					ac = account[i];
					break;
				}
			}
		}
		return ac;
	}
}