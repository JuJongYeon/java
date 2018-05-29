package java_example_180523;

public class ch6_05_KoreanExample {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1,k2 객체를 각각 생성해서 필드값을 출력해보세요.
		//객체 생성
		ch6_05_Korean k1 = new ch6_05_Korean("주종연","940711");
		//객체 생성
		ch6_05_Korean k2 = new ch6_05_Korean("홍길동","561654");
		//ch6_05_Korean의 틀을 가져와서 사용만하는거 k1과k2는 각각 다른 객체
		System.out.println("나라 :"+k1.nation);
		System.out.println("이름 :"+k1.name);
		System.out.println("주민번호 :"+k1.ssn);
		
		System.out.println("-----------------------------");
		
		System.out.println("나라 :"+k2.nation);
		System.out.println("이름 :"+k2.name);
		System.out.println("주민번호 :"+k2.ssn); 		
	}
}
