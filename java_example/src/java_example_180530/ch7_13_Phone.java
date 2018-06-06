package java_example_180530;
//추상클래스 선언 : abstract
public abstract class ch7_13_Phone {
	//필드  선언
	public String owner;
	
	//생성자 선언
	public ch7_13_Phone(String owner) {
		
	}
	

	//메소드 선언
	public void turnOn() {
		System.out.println("폰 전원이 켜집니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원이 꺼집니다.");
	}
}
