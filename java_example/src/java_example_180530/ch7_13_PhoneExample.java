package java_example_180530;

public class ch7_13_PhoneExample {

	public static void main(String[] args) {
		//자식클래스의 객체 생성
		ch7_13_SmartPhone sp = new ch7_13_SmartPhone("소유자");
		
		//추상클래스의 객체생성
		//ch7_13_Phone p = new ch7_13_Phone("소유자"); <-생성안댐
		
		sp.internetSerch();
		sp.turnOff();
		sp.turnOn();

	}

}
