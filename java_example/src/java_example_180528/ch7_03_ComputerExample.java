package java_example_180528;

public class ch7_03_ComputerExample {

	public static void main(String[] args) {
		int r=10;
		
		//부모클래스의 메소드 호출
		ch7_03_Calculator c = new ch7_03_Calculator();
		System.out.println(c.areaCircle(r));
		
		//자식 클래스에서 재정의된 메소드 호출
		ch7_03_Computer com = new ch7_03_Computer();
		System.out.println(com.areaCircle(r));
	}

}
