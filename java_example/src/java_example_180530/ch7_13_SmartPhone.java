package java_example_180530;
//추상클래스를 상속받는 자식클래스
public class ch7_13_SmartPhone extends ch7_13_Phone{
	//생성자 선언
	public ch7_13_SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드 선언
	public void internetSerch() {
		System.out.println("인터넷 검색을 실행합니다.");
	}
}
