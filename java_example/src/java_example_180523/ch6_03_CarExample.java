package java_example_180523;

public class ch6_03_CarExample {

	public static void main(String[] args) {
		//Car 클래스 객체 선언
		//Car 클래스에서 선언한 필드값을 출력
		ch6_03_Car myCar = new ch6_03_Car();//myCar생성
		
		//필드값 출력
		System.out.println("Car 클래스의 company 필드값:"+myCar.company);
		System.out.println("Car 클래스의 model 필드값:"+myCar.model);
		System.out.println("Car 클래스의 color 필드값:"+myCar.color);
		System.out.println("Car 클래스의 maxSpeed 필드값:"+myCar.maxSpeed);
		
		//필드값 변경
		/*int number=10;
		number=30;*/
		myCar.maxSpeed+=50;
		System.out.println("Car 클래스의 maxSpeed 필드값:"+myCar.maxSpeed);
		for(int i = 0;i<=10;i++) {
			myCar.maxSpeed+=i;
		}
		System.out.println("Car 클래스의 maxSpeed 필드값:"+myCar.maxSpeed);

	}

}
