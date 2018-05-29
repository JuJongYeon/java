package java_example_180524;
//Getter, Setter 메소드 사용 에제
public class ch6_18_Car {
	//필드 선언
	private int speed;
	private boolean stop;
	//개꿀 소스에서 제너레이트 겟&셋 들가서 ok하면 생성


	//메소드 선언
	//speed 필드에 대한 getter 메소드 선언
	//int 타입은 get
	public int getSpeed() {
		return speed;
	}
	//speed 필드에 대한 setter 메소드 선언
	public void setSpeed (int speed) {
		if(speed<0) {
			this.speed=0;
		}else {
			this.speed=speed;
		}
	}
	//stop 필드에 대한 getter 메소드 선언
	//불린은 is로 시작
	public boolean isSpeed() {
		return stop;
	}
	//stop 필드에 대한 setter 메소드 선언
	public void setStop(boolean stop) {
		this.stop=stop;
		this.speed=0;
	}
}
