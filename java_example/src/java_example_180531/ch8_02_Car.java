package java_example_180531;

public class ch8_02_Car {
	//좌변 : ch8_02_Tire 인터페이스 타입의 변수 frontLeftTire선언 
	//우변: ch8_02_HankookTire 객채를 frontLeftTire에 넣겟따.
	ch8_02_Tire frontLeftTire = new ch8_02_HankookTire();
	ch8_02_Tire frontRightTire = new ch8_02_HankookTire();
	ch8_02_Tire backLeftTire = new ch8_02_HankookTire();
	ch8_02_Tire backRightTire = new ch8_02_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
