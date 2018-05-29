package java_example_180528;

public class ch7_02_StudentExample {

	public static void main(String[] args) {
		//student 클래스에 대한 객체 생성
		ch7_02_Student student = new ch7_02_Student("adㅁㄴㅇㅁㄴㅇㅁㅇㄴ","123215",10);
		
		//부모클래사의 필드
		System.out.println("이름:"+student.name);
		System.out.println(student.ssn);
		
		//자식 클래스의 필드
		System.out.println(student.studentNo);
	}

}
