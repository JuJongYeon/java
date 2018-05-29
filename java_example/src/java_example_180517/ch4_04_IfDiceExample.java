package java_example_180517;
/*
 * random 메소드
 * Math.random() : double 타입의 실수 출력 0.0<= ??? <1.0 사이의 값
 * 0~9까지의 난수를 발생시키려면 
 * (int)(Math.random()*10)
 * 1~10까지 난수
 * (int)(Math.random()*10)+1
 * 로또번호
 * (int)(Math.random()*45)+1
 * 
 * 주사위 번호 뽑기
 * 1~6까지 난수를 발생해서
 * 1이 나오면 1번이 나왔습니다.
 * 2가 나오면 2번이 나왔습니다.~~~
 */
import java.util.Scanner;

public class ch4_04_IfDiceExample {

	public static void main(String[] args) {

		int s = (int)(Math.random()*6)+1;
		//
		System.out.println("주사위값");
		
		if(s==6) {
			System.out.println("6번이 나왔습니다.");
		}
		else if(s==5) {
			System.out.println("5번이 나왔습니다.");
		}
		else if(s==4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if(s==3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if(s==2) {
			System.out.println("2번이 나왔습니다.");
		}
		else{
			System.out.println("1번이 나왔습니다.");
		}		
	}
}
