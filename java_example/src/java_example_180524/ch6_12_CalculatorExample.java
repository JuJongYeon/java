package java_example_180524;
//static 필드, 메소드 사용
public class ch6_12_CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10*10*ch6_12_Calculator.pi;
		//10 x 10 x 3.14159
		System.out.println(result1);
		
		int result2 = ch6_12_Calculator.plus(10, 10);
		System.out.println(result2);
		
		int result3 = ch6_12_Calculator.minus(10, 20);
		System.out.println(result3);
	}

}
