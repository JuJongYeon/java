package java_example_180518;

import java.util.Scanner;

public class ch4_22_Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		int m;
		int sum = 0;
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			s = scanner.nextInt();
			if(s==1) {
				System.out.print("예금액>");
				m = scanner.nextInt();
				sum+=m;
				System.out.println("현재 잔액은"+sum+"입니다.");
			}
			else if(s==2) {
				System.out.print("출금액>");
				m = scanner.nextInt();
				sum-=m;
				System.out.println("현재 잔액은"+sum+"입니다.");
				if(sum<0) {
					System.out.println("잔고가 부족합니다.");
					sum = sum+m;
					System.out.println("현재 잔액은"+sum+"입니다.");
				}
			}
			else if(s==3) {
				System.out.println("현재 잔액은"+sum+"입니다.");
			}
			else if(s==4){
				System.out.println("끝");break;
			}
		}
	}
}

