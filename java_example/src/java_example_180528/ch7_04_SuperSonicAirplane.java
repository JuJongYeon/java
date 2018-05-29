package java_example_180528;
//airplane의 자식클래스
public class ch7_04_SuperSonicAirplane extends ch7_04_Airplane{
	//1의 값을 갖는 NORMAL 상수 정의ㅏ
	//2의 값을 갖는 SUPERSONIC 상수 정의
	public static final int NORMAL = 1;
	public static final int  SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//fly 메소드 재정의
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		}else {
			//부모 클래스의 메소드 호출(재정의가 안된)
			super.fly();
		}
	}
	
}
