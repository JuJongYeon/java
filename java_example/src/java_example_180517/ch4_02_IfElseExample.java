package java_example_180517;

public class ch4_02_IfElseExample {

	public static void main(String[] args) {
		/*
		 * score 변수값을 85로 선언
		 * score가 90이상이면 90보다 큽니다.등급은 A입니다 출력
		 * 90미만인 경우 90보다 작습니다. 등급은 B입니다 출력
		 */
		int score=85;
		if(score>=90) {
			System.out.println("90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		else {
			System.out.println("90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
