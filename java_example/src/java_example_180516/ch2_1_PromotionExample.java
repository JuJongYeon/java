package java_example_180516;

public class ch2_1_PromotionExample {
	
	public static void main(String [] args) {
	//여기서 부터 메인 메소드가 실행이 된다.
		byte byteValue = 10;
		//byte 타입의 변수 byteValue 선언하면서 초기값 10으로 줌
		
		int intValue = byteValue;
		//기존 byte 타입의 변수가 int 타입으로 자동 타입변화ㅓㄴ 발생
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드="+intValue);
		//int는 문자를 못다루기때문에 유니코드(숫자)로 변환되어 출력
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}
}
