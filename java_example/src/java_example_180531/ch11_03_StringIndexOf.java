package java_example_180531;

public class ch11_03_StringIndexOf {

	public static void main(String[] args) {
		//indexOf() 메소드
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("location의 값:"+location);
		//"프로그래밍"이 시작되는 값 3
		
		//length() 메소드
		int length = subject.length();
		System.out.println("subject의 length의 값"+length);
		
		//replace()메소드
		String newStr = subject.replace("자바", "JAVA");
									//기존에 있던문자,바꿀문자
		System.out.println(newStr);
		
		//substring() 메소드
		String ssn = "1805031-3456789";
		String firstNum = ssn.substring(0, 6);
		String secondNum = ssn.substring(7);
		System.out.println("ssn.substring(0, 6)의 값:"+firstNum);
		System.out.println("ssn.substring(7)의 값:"+secondNum);
		
		//toLowerCase(),toUpperCase() 메소드
		String str3 = "abCdEFGhijKLMnopQEStuvWxYz";
		String str3Lower = str3.toLowerCase();
		String str3Upper = str3.toUpperCase();
		System.out.println("str3Lower의 값:"+str3Lower);
		System.out.println("str3Upper의 값:"+str3Upper);
		
		//trim()메소드 = 앞뒤 공백을 없에는 메소드
		String tel1="   02";
		String tel2="1234     ";
		String tel3="   5555       ";
		String tel=tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련이 없는 책이군요.");
			
			
		}

	}

}
