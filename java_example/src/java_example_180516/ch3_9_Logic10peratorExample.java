package java_example_180516;
/* 논리연산자
 * 논리연산은 true, false를 가지고 연산을 수행함.
 * AND 연산(&&)
 * 	A&&B
 */
public class ch3_9_Logic10peratorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) && (charCode<=90)) {
			System.out.println("대문자입니다.");
		}
		
		if( (charCode>=97) && (charCode<=122)) {
			System.out.println("소문자입니다.");
		}
		
		if( !(charCode<48) && !(charCode>57)) {
			System.out.println("0~9의 숫자 입니다.");
		}
		
		int value = 6;
		if( (value%2 == 0) || (value%3 == 0)) {
			System.out.println("2 또는 3의 배수입니다.");
		}
	}

}
