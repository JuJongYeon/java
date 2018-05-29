package java_example_180517;
//char타입을 변수로 하는 switch case문
public class ch4_07_SwitchCharExample {

	public static void main(String[] args) {
		char g = 'a';
		//String p = "과장";
		
		switch(g) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다."); break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다."); break;
		default:
			System.out.println("손님입니다."); break;
		}
	}

}
