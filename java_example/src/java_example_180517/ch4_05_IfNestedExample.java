package java_example_180517;

import java.util.Scanner;

//중첩if문
/*
 * 점수를 입력받고 90점 이상인 점수에 대해서 95점 이상이면 A+
 * 90이상 95미만이면 A
 * 85~89는 B+
 * 80~84는 B
 * 75~79는 C+
 * 70~74는 C
 * 65~69는 D+
 * 60~64는 D
 * 60미만 F
 * if문이 끝나면 학점을 출력하는 print문 사용
 * 주의할 점은 학점값을 처리하는 String 타입의 변수를 하나 사용
 */
public class ch4_05_IfNestedExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		System.out.print("점수를 입력하세요:");
		s = scanner.nextInt();
		String g;
		if(s>=90) {
			if(s>=95) {
				g = "A+";
			}
			else {
				g = "A";
			}
		}else if (s>=80) {
			if(s>=85) {
				g = "B+";
			}
			else {
				g = "B";
			}
		}else if(s>=70) {
			if(s>=75) {
				g = "C+";
			}
			else {
				g = "C";
			}
		}else if (s>=60) {
			if(s>=65) {
				g = "D+";
			}
			else {
				g = "D";
			}
		}
		else {
			g = "F";
		}
		System.out.println("당신의 학점은"+g+"입니다.");
	}
}
