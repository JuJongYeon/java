package java_example_180529;

public class ch7_10_Car {
	//필드 선언
	public String color;
	public int speed;
	
	public ch7_10_Car(String color,int speed) {
		this.color=color;
		this.speed=speed;
	}
	
	public void SpeedUp(int speed) {
		System.out.println("속도가"+this.speed+speed+"만큼 올라갑니다.");
	}
	public void SpeedDown(int speed) {
		System.out.println("속도가"+(this.speed-speed)+"내려갑니다.");
	}
}
