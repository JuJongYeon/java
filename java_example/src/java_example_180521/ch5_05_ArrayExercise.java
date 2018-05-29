package java_example_180521;

import java.util.Scanner;

/*
 * 문제 : 양수 5개를 입력받아서 배열에 저장하고
 * 		입력 받은 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
 */
public class ch5_05_ArrayExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[5];
		//최대값을 담을 변수 선언.
		int max = arr1[0];
		System.out.println("양수 5개를 입력하세요 :");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scanner.nextInt();
		if(arr1[i] > max) {
			max=arr1[i];
			}
		}System.out.println("가장 큰 수는 "+max+"입니다.");
	}
}
