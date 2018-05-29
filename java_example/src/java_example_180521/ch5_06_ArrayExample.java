package java_example_180521;
import java.util.Scanner;

public class ch5_06_ArrayExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int temp;//자리 바꿈을 위한 임시용 변수
		System.out.println("정수 5개를 입력하세요 :");
		//정수 입력을 위한 반복문
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		//내림차순 정렬을 위한 처리 부분
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]<arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.println("입력값 내림차순 정렬:");
		for(int n=0;n<arr.length;n++)
			System.out.println(arr[n]+"");
	}
}
