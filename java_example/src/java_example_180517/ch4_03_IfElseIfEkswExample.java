package java_example_180517;

import java.util.Scanner;

//if,else if,else if,....else
public class ch4_03_IfElseIfEkswExample {

	public static void main(String[] args) {
		/*
		 * 점수를 scan으로 입력받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A입니다.
		 * 80이상 90미만이면 점수가 80~90입니다.등급은 B입니다.
		 * 70이상 80미만이면 점수가 70~80입니다.등급은 C입니다.
		 * 60이상 70미만이면 점수가 60~70입니다.등급은 D입니다.
		 * 60미만이면 점수가 60미만입니다. 재수강 ㄱㄱㄱㄱㄹㄹㄹㄹㄹㄹㄹㄹㄹ
		 */
		Scanner scanner = new Scanner(System.in);
		int s;
		System.out.print("점수를 입력하세요:");
		s = scanner.nextInt();
		if(s>=90) {
			System.out.println("점수가 90~100입니다,등급은 A입니다.");
		}
		else if (s<90 && s>=80) {
			System.out.println("점수가 90미만 80이상입니다,등급은 B입니다.");
		}
		//90>s>=80은 프로그렘에서는 못씀 && , || 넣어줘야 쓸수있음
		else if (s<80 && s>=70) {
			System.out.println("점수가 80미만 70이상입니다,등급은 C입니다.");
		}
		else if (s<70 && s>=60) {
			System.out.println("점수가 70미만 60이상입니다,등급은 D입니다.");
		}
		else {
			System.out.println("점수가 60미만입니다,재수강입니다.");
		}

	}

}
