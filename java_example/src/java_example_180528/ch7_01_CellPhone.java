package java_example_180528;
//부모클래스 ch7_01_CellPhone
public class ch7_01_CellPhone {
	//필드 선언
	String model;
	String color;
	
	//메소드 선언
	void PowerOn( ) {
		System.out.println("전원을 켭니다.");
	}
	void PowerOff( ) {
		System.out.println("전원을 끕니다.");
	}
	void bell( ) {
		System.out.println("벨이 울립니다..");
	}
	void sendVoice(String massage) {
		System.out.println("자기:"+massage);
	}
	void receiveVoice(String massage) {
		System.out.println("상대방:"+massage);
	}
	void hangUp( ) {
		System.out.println("전화를 끊습니다.");
	}
}
