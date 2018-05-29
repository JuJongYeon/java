package java_example_180521;

public class ch5_11_ArrayExmaple {

	public static void main(String[] args) {
		int []scores= {1,2,3,4,5};
		String [] var = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		for(int i : scores) {
			sum=sum+i;
			System.out.print(i+" ");
		}
		System.out.println("합은?"+sum);
		for(String j : var) {
			System.out.print(j+"  ");
		}
	}
}
