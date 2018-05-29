package java_example_180521;

import java.util.Scanner;

/*
 * 거스름돈 문제
 * 어떤 금액을 입력하게 되면 각 동전이 몇개씩 필요한지 출력 하는 문제
 * 가능한 적은 수의 동전으로 거슬러 줄 수 있도록
 * 예를 들어 2680원 이면
 * 500원:5개
 * 100원:1개
 * 50원:1개
 * 10원:3개
 */
public class ch05_07_ArrayExercise {

	public static void main(String[] args) {
		int[] arr = {500,100,50,10};
		Scanner scanner = new Scanner(System.in);
		int m;
		int sum=0;
		System.out.println("금액을 입력하세요.");
		m =scanner.nextInt();
		for(int i=0;i<arr.length;i++) {
			int coin=m/arr[i];
			System.out.println(arr[i]+"원 동전:"+coin+"개");
			m=m%arr[i];
		}
	}
}
