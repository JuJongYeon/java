package java_example_180516;

public class ch3_5_StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 문자열을 저장할 수 있는 타입
		String str = "스트링변수 저장 및 선언";
		String str1 = "JDK" + 8.0;//JDK8.0
		String str2 = str1 + "특징";//JDK8.0특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;//JDK33.0
		//6.0이 나올라면 괄호(3+3.0)를 해줘야댐
		String str4 = 3 + 3.0 + "JDK";//6.0JDK
		System.out.println(str3);
		System.out.println(str4);
	}

}
