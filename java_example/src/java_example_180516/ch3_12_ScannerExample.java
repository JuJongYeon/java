package java_example_180516;

import java.util.Scanner;
//스캐너를 사용하기위한 라이브러리 유틸?
/*
 * next(); : 문자열 입력
 * nextInt(); : 정수 입력
 * nextDouble(); : 실수 입력
 * close(); : 스캐너 종료
 */
public class ch3_12_ScannerExample {

	public static void main(String[] args) {
		//스캐너를 사용하기 위한 스캐너 객체 생성
		Scanner s =  new Scanner(System.in);
		//      s 여기 들가는 s는 내가 임의로 적을수있음
		String name;
		System.out.print("당신의 이름을 입력해주세요:");
		name = s.next(); //.next();는 문자열 입력을 위한 스캐너의 메소드
		System.out.println("당신의 이름은" + name + "입니다.");
		s.close();
	}
}
