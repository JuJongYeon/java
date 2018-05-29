package java_example_180524;

public class ch6_20_ExerciseExample {

	public static void main(String[] args) {
		ch6_20_Exercise st1 = new ch6_20_Exercise();
		//setter를 이용한 필드값 할당
		st1.setName("남자");
		st1.setAssScore(80);
		st1.setExamScore(90);
		st1.result();
		
		ch6_20_Exercise st2 = new ch6_20_Exercise();
		st2.setName("여자");
		st2.setAssScore(90);
		st2.setExamScore(85);
		st2.result();
	}
}
