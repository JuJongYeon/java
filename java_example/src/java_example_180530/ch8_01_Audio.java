package java_example_180530;

public class ch8_01_Audio {
	public static void main(String [] args) {
		//인퍼페이스 타입의 변수 선언
				ch8_01_RemoteControl rc;
				//각각의 객체를 인터페이스 타입의 변수에 대입
				//따라서 rc는 Television 객체가 됨
				/*ch8_01_RemoteControl*/  rc = new ch8_01_Television();
				rc.turnOn();
				rc.turnOff();
				//ch8_01_RemoteControl인터페이스를 상속을 받은거 같은거라 Television 클래스 안에 안써놨어도 쓸 수 있음
				rc.setMete(true);
				rc.setVolume(10);
				//Audio1 객체를 rc에 대입
				//따라서 rc는 Aduio객체가 됨
				rc = new ch8_01_Audio1();
				rc.turnOn();
				rc.turnOff();
				//Aodio1 안에 제정의해서 썼음
				rc.setMete(true);
				//static으로 써서 직접가져와서 쓸 수 있다.
				rc.setVolume(0);
				ch8_01_RemoteControl.changeBattery();
	}
}
