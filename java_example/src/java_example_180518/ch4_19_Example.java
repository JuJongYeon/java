package java_example_180518;

public class ch4_19_Example {

	public static void main(String[] args) {
		int i = 1;
		int sum=0;
		int a =1;
		int c =1;
		/*while(true) {
			sum=sum+i;
			if(sum>=100) break;
			c++;//순차적 숫자 증가를 위한 증감연산자
			a=-a;//부호 변경
			i=a*c;
		}
		System.out.println("숫자"+i);
		System.out.println("합"+sum);*/
		for(c=1;sum<100;c++,a=-a) {
			i=c*a;
			sum=sum+i;
		}System.out.println("숫자"+i);
		System.out.println("합"+sum);
}
}