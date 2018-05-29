package java_example_180523;

public class ch6_07_CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		//powerOn 메소드 호출
		//plus 메소드 호출 및 호출 결과 출력
		//divide 메소드 호출 및 호출 결과 출력
		//powerOff 메소드 호출
		ch6_07_Calculator c1 = new ch6_07_Calculator();
		c1.PowerOn();
		
		ch6_07_Calculator c2 = new ch6_07_Calculator();
		System.out.println(c2.plus(500, 600));//호출 결과는 30
		int result = c2.plus(3, 5);
		System.out.println(result);
		
		ch6_07_Calculator c3 = new ch6_07_Calculator();
		System.out.println(c3.divide(540.5, 35.4));
		
		ch6_07_Calculator c4 = new ch6_07_Calculator();
		c4.PowerOff();
	}
}
