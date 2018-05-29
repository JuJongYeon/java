package java_example_180524;

public class ch6_13_SingletonExample {

	public static void main(String[] args) {
		//일반적인 객체 생성하는 방식
		//ch6_13_Singleton o2 = new ch6_13_Singleton();
		
		
		//싱글톤으로 선언한 클래스를 사용하는 방식
		ch6_13_Singleton o1 = ch6_13_Singleton.getInstance();
		
	}
}
