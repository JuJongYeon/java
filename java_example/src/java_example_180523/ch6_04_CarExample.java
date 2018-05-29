package java_example_180523;
//CarExample 클래스
public class ch6_04_CarExample {

	public static void main(String[] args) {
		ch6_04_Car myCar = new ch6_04_Car("블루",200);
		//String color에는 블루,int cc 에는 200 으로 필드 초기화하면서 객체 생성.
		ch6_04_Car myCar1 = new ch6_04_Car("블랙",300);
		ch6_04_Car myCar2 = new ch6_04_Car("래드",400);
		ch6_04_Car myCar3 = new ch6_04_Car("화이트",5000);
		//형식을 맞춰줘야한다.1개만 쓰면 안댐
		//ch6_04_Car myCar2 = new ch6_04_Car("래드"); -> 이러면 안댐
		//변수 형식도 맞춰 줘야댐 


		System.out.println();
	}

}
