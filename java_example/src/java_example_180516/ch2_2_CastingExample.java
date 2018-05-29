package java_example_180516;

public class ch2_2_CastingExample {
	
	public static void main(String[] args ) {
		
		int intValue = 54651;
		char charValue = (char) intValue;
		//()안의 타입으로 강제 형변환
		//char charValue = intValue; => 에러
		System.out.println(charValue);
		//정수 44032를 문자로 변형
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		//
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		//
	}

}
