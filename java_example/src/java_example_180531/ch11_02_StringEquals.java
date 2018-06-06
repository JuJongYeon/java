package java_example_180531;

public class ch11_02_StringEquals {
	public static void main(String[] args) {
		//같은 내용을 담고 있지만
		//다른 속성을 가지고 있다.
		String str1 = new String("이름");
		String str2 = "이름";
		
		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(str1.endsWith(str2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");

		}
	}
}
