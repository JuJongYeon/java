package java_example_180518;
//배열 선언 예제 p.152
public class ch5_01_ArrayCreatByValueListExample {

	public static void main(String[] args) {
		//배열 선언:int 타입의 scores라는 배열 변수 선언
		//int[] scores;
		int[] scores = {83,90,87};
		//배열의 길이 5개,인덱스 0~4, 인덱스 길이 5개 0부터 시작임
		
		//배열 값 접근(출력)
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[0]="+scores[1]);
		System.out.println("scores[0]="+scores[2]);
		
		//배열의 길이 확인하기
		int length = scores.length;
		System.out.println("배열길이 length 변수값:"+length);
		
		//배열 요소들의 합 구하기
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			
			sum = sum + scores[i];
			//반복문에 접는하는 방법
			
		}System.out.println(sum);
		 double avg=sum/scores.length;
		 System.out.println(avg);
	}

}
