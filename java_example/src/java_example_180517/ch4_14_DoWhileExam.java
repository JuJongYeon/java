package java_example_180517;

import java.util.Scanner;

//문자열비교
public class ch4_14_DoWhileExam {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String e;
		System.out.println("메시지를 입력하세요");
		do {
			System.out.print(">");
			e = scanner.next();
			System.out.println(e);
		}
		while(!e.equals("q"));
		System.out.println("프로그램 종료");
	}
}
