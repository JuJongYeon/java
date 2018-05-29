package java_example_180517;

import java.util.Scanner;

public class ch4_16_Exam {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.println("점수를 입력하고 마지막에 0을 입력하세요.");
		int i=0;
		double avg= 0;
		while(true) {
			avg += num;
			num = scanner.nextInt();
			if(num==0) 
				break;
			i++;
		}
		System.out.println("수의 개수는"+i+"개이며 평균은"+(avg/i)+"입니다.");
	}
}
