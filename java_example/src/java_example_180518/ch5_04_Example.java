package java_example_180518;

import java.util.Scanner;

/*arr1[] = scanner.nextInt();
 * 3열짜리 1차원 배열을 선언하고
 * 스캐너를 이용하여 값을 하나하나 입력하고
 * 입력된 값의 총 합 및 평균 값을 구하시오.
 */
public class ch5_04_Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[3];
		int length=arr1.length;
		int sum=0;
		for(int i=0;i<length;i++) {
			System.out.print((i+1)+"번쨰 숫자을 입력하세요:");
			arr1[i] = scanner.nextInt();
			sum = sum+arr1[i];
		}
		for(int j=0;j<length;j++) {
			System.out.println((j+1)+"번쨰 입력한 숫자는:"+arr1[j]);
		}
		System.out.println("배열의 합="+sum);
		double avg=sum/length;
		System.out.println("배열의 평균="+avg);
	}
}
