package java_example_180523;

import java.util.Scanner;

public class ch6_10_CalculatorExample {

	public static void main(String[] args) {
		ch6_10_Calculator c= new ch6_10_Calculator();
		Scanner scan = new Scanner(System.in);
		
		int x=0;
		int y=0;
		
		c.width=x;
		c.height=y;
		System.out.println("가로를 입력해주세요");
		x=scan.nextInt();
		System.out.println("세로를 입력해주세요");
		y=scan.nextInt();
		
		int result1= c.areaRectangle(x);
		int result = c.areaRectangle(x, y);
		System.out.println("정사각 형 넓이:"+result1);
		System.out.println("직사각형 넓이:"+result);
		
	}
}
