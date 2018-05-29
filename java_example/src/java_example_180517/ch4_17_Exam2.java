package java_example_180517;

import java.util.Scanner;

/*
 * 1부터 입력받은 수까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 게산하시오
 */
public class ch4_17_Exam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자를 입력해주세요 :");
		int s = scanner.nextInt();
		for(int i=1;i<=s;i++) {
			//2의 배수로 판단 : s%2==0
			//3의 배수로 판단 : s%3==0
			if(i%2 !=0 && i%3 !=0) {
				sum = sum+i;
			}
		}System.out.println("합계:"+sum);
		
	}
}
