package java_example_180524;
//메인문을 보고 클래스객채 생성해보기
public class ch6_11_CarExample {

	public static void main(String[] args) {
		ch6_11_Car myCar = new ch6_11_Car("포르쉐");
		//객체를 생설할 때 매개변수를 어떻게 전달했는지..
		//String 한개 => 생성자선언
		ch6_11_Car yourCar= new ch6_11_Car("벤츠");
		
		//메소드 호출
		//run() 메소드 호출했을떄 어떤 결과가 나오는지
		myCar.run();
		yourCar.run();
	}

}
