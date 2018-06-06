package java_example_180531;

import java.util.Arrays;
import java.util.Collections;

public class ch11_04_ArrayMethod {

	public static void main(String[] args) {
		/*int [] score = {100,90,80};*/
		String [] score = {"가나바","쌍마바하","하아"};
		
		for (int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		System.out.println("------------------");
		//Arrays.sort(score);//배열을 오름차순으로 정렬해줌 배열자체가 바뀜
		Arrays.sort(score, Collections.reverseOrder());//내림차순으로 정렬해줌
		for (int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
	}
}
