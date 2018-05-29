package java_example_180516;

import java.util.Scanner;

public class ch3_15_asd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		System.out.print("초를 입력하세요:");
		s = scanner.nextInt();
		System.out.println(s+"초는"+(s/3600)+"시간"+(s%3600/60)+"분"+(s%3600%60)+"초입니다.");
	}

}
