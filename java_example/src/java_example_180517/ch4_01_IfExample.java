package java_example_180517;

public class ch4_01_IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		//if(score>=90)
			//System.out.println("if문실행");
		//iff문이 1줄일경우 중괄호 안하고 바로 실행가능
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
