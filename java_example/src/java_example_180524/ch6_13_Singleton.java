package java_example_180524;
//싱글톤 예제 p.244
public class ch6_13_Singleton {
	private static ch6_13_Singleton singleton = new ch6_13_Singleton();
	
	private ch6_13_Singleton() {
		
	}
	static ch6_13_Singleton getInstance(){
		return singleton;
	}
}
