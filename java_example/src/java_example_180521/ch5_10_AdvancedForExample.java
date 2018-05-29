package java_example_180521;
/*
 * 향상된 for문(for-each문)
 */
public class ch5_10_AdvancedForExample {

	public static void main(String[] args) {
		int []scores= {95,85,90,66,88};
		int sum = 0;
		for(int i : scores) {
			sum=sum+i;
			System.out.println(i);
		}
		System.out.println("점수 총합:"+sum);
	}
}
