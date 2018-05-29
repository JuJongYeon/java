package java_example_180517;

public class ch4_13_WhileprintFrom1to10Example {

	public static void main(String[] args) {
		int i = 1;
		int sum=0;
		while(i<=100) {
			//와일문의 조건식을 만족하는 동안 실행됨
			i++;
			sum += i;
		}System.out.println(i);
		System.out.print("1부터 100까지의 합:"+sum);
	}

}
