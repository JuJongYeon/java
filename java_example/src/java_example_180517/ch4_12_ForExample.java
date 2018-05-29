package java_example_180517;

import java.util.Scanner;

public class ch4_12_ForExample {

	public static void main(String[] args) {
		//출력 형태
		//1+2+3+4+5+6+7+8+9+10=55
		Scanner scanner = new Scanner(System.in);
		int s;
		System.out.print("더하고 싶은 처음숫자를 입력하세요:");
		s = scanner.nextInt();
		int e;
		System.out.print("더하고 싶은 끝숫자를 입력하세요:");
		e = scanner.nextInt();

		int sum = 0;
		for(int i=s;i<=e;i++) {
			sum=sum+i;
			System.out.print(i);
			
			if(i<=(e-1))
				System.out.print("+");
			else {
				System.out.println("=");
				System.out.print(sum);
			}
		}
	}
}
