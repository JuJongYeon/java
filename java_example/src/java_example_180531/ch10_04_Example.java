package java_example_180531;
import java.util.Scanner;
public class ch10_04_Example {
	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		double bunja;
		double bunmo;
		System.out.print("분자를 입력하세요:");
		bunja = scan.nextInt();
		System.out.print("분모를 입력하세요:");
		bunmo = scan.nextInt();
		double a= bunja/bunmo; 
		System.out.println("두 숫자의 나눈값:"+a);
		}catch(ArithmeticException 나눗셈) {
			System.out.println("숫자를 똑바로 입력해주세요.");
		}finally {
			System.out.println("안녕하세요.");
		}
	}
}
