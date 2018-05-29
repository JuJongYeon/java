package java_example_180516;

public class ch2_3_OperationPromotionExample {
	
	public static void main(String[]args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = (byte) (byteValue1 + byteValue2);
		int intValue = byteValue1 + byteValue2;
		//정수 타입을 계산시에는 int타입으로 변환하여 계산해야함
		//byte 타입은 계산 불가능
		//계산할라면 byte타입으로 강제 형변환 해서 하면댐
		System.out.println(intValue);
		//System.out.println(byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		char charValue3 = (char) (charValue1 + charValue2); //컴파일에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; //컴파일에러
		double doubleValue = intValue5 / 4.0;
		//int 가 double로 자동형변환
		System.out.println(doubleValue);
	}

}
