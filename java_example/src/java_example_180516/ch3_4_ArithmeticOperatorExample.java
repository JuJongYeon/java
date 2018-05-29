package java_example_180516;

public class ch3_4_ArithmeticOperatorExample {
	
	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1="+result1);//7
		
		int result2 = v1 - v2;
		System.out.println("result2="+result2);//3
		
		int result3 = v1 * v2;
		System.out.println("result3="+result3);//10
		
		int result4 = v1 / v2;//일반적인 나누기
		System.out.println("result4="+result4);//2
		
		int result5 = v1 % v2;//나누고 남은 몪,나머지값
		System.out.println("result5="+result5);//1
		
		double result6 = (double) v1/v2;
		//연산타입을 실수인 더블로 바꿔서 2.5로 나옴
		System.out.println("result6="+result6);//2.5
	}

}
