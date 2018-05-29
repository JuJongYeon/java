package java_example_180523;

public class ch6_08_CarExample {

	public static void main(String[] args) {
		//Car 클래스의 객체 생성
		ch6_08_Car car = new ch6_08_Car();
		//setGas 메소드를 호출하면서 매개값은 5로 지정
		car.setGas(5);
		
		//isLeftGas 메소드 호출결과를 gasState 라는 변수에 담으세요
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		//여기까지 실행됐을때 gas 필드 닶은 ? = 0
		System.out.println(car.isLeftGas());//false
		if(car.isLeftGas()) {//false값-else출력
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입해주세요.");
		}
	}
}
