package java_example_180531;

public class ch11_01_StringCharAt {

	public static void main(String[] args) {
		//charAt()메소드
		String ssn = "180531-456789";
		char gender = ssn.charAt(7);
		//charAt(숫자)는 문자열의 숫자번째를 리턴
		switch(gender) {
		case '1':
			System.out.println("남자입니다.");
			break;
		case '2':
			System.out.println("여자입니다.");
			break;
		case '3':
			System.out.println("남자입니다.");
			break;
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
