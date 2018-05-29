package java_example_180518;
/*
 * 숫자맞추기 게임
 * 1.1~100까지의 난수 발생
 * 2.사용자가 숫자를 입력하도록한다.
 * 3.발생된 난수와 사용자가 입력한 숫자를 비교한다.
 * 	3.1입력한 숫자가 클 경우 숫자가 큽니다. 출력하고 1횟수 증가
 * 	3.2입력한 숫자가 작을경우 숫자가 작습니다. 출력하고 1횟수 증가
 * 	3.3입력한 숫자가 맞을경우 정답입니다. 출력하고 1횟수 증가
 *	3.4 시도횟수 츨력
 *	3.5반복문을 빠져나온다.
 */
import java.util.Scanner;

public class ch4_21_Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int r = (int)(Math.random()*100)+1;
		int c = 0;
		while(true){
			c++;
			System.out.print("1과 100사이의 값을 입력하세요:");
			num = scanner.nextInt();
			if(num == r) {
				System.out.println("정답입니다.");
				System.out.println("시도횟수는"+c+"입니다");
				System.out.println("수고하셨습니다.");
				break;
			}
			else if(num > r) {
				System.out.println("더 낮은 숫자를 입력하십시오.");
			}
			else if(num < r) {
				System.out.println("더 큰 숫자를 입력하십이오.");
			}
		}
	}
}