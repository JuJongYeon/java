package java_example_180531;

public class ch8_02_CarExample {

	public static void main(String[] args) {
		ch8_02_Car car = new ch8_02_Car();
		
		car.run();
		
		car.frontLeftTire = new ch8_02_goldhoTire();
		//ch8_02_Car 클래스 변수 car(ch8_02_Car)에 ch8_02_goldhoTire로 바꿔버림
		car.run();
	}

}
