package java_example_180525;

import java.util.Scanner;

public class ch6_23_MemberServiceExample {

	public static void main(String[] args) {
		ch6_23_MemberService ms = new ch6_23_MemberService();
		Scanner scan = new Scanner(System.in);
		while(true) {
			int s;
			System.out.println("--------------");
			System.out.println("수행할 서비스를 선택해주세요.");
			System.out.println("1.로그인"+"||"+"2.로그아웃");
			System.out.println(">>");
			s = scan.nextInt();
			if(s==1) {
				System.out.println("아이디를 입력해주세요");
				ms.id = scan.next();
				System.out.println("페스워드를 입력해주세요");
				ms.pass=scan.next();
				
				boolean result =ms.login("whddus", "123456");
				if(result) {
					System.out.println(ms.id+"님이 로그인 되었습니다.");
					ms.logout();
				}else {
					System.out.println("id 또는 password가 올바르지 않습니다.");
				}
			}else if(s==2) {
				System.out.println("로그아웃되었습니다.");break;
			}
		}
	}
}

