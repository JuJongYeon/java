package java_example_180517;

import java.util.Scanner;

//점수,학년을 입력받아 60점 이상이면 합격,미만이면 불합격을 출력
//단 4학년은 70점 이상이어야 합격
public class ch4_08_ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		System.out.print("점수를 입력하세요:");
		s = scanner.nextInt();
		
		int g;
		System.out.print("학년을 입력하세요:");
		g = scanner.nextInt();
		
		if(s>=60) {
			if(g != 4)
				System.out.println("합격입니다.");
			else if(s<70 && g==4)
				System.out.println("불합격입니다.");
		}
		else
			System.out.println("불합격입니다");
	}

}
