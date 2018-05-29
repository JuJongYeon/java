package java_example_180524;

public class ch6_18_CarExample {

	public static void main(String[] args) {
		ch6_18_Car car = new ch6_18_Car();
		
		//car.speed=100;
		//setter를 호출하여 속도 값을 설정
		car.setSpeed(100);
		System.out.println("현재 속도:"+car.getSpeed());

		if(!car.isSpeed()) {
			car.setStop(true);
		}
		System.out.println("현재 속도:"+car.getSpeed());}}



