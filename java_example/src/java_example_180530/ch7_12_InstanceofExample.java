package java_example_180530;

public class ch7_12_InstanceofExample {
	//method1의 매개변수 : Parent 클래스 타입의 변수 parent
	public static void method1 (ch7_12_Parent parent) {
		//parent 변수가 ch7_12_Child 클래스 타입인지?
		if (parent instanceof ch7_12_Child) {
			//instanceof
			//parent 변수를 Child 클래스타입으로 강제형변환해서
			//Child 클래스 타입의 변수 child에 대입한다.
			ch7_12_Child child = (ch7_12_Child) parent;
			System.out.println("methed1 - Child로 변환 성공");
		}else {
			System.out.println("methed1 - Child로 변환되지 않음");
		}
	}
	//강제 형변환이 가능한지 여부를 묻지않고 강제 형변환을 수행하는 메소드
	public static void method2(ch7_12_Parent parent) {
		ch7_12_Child child = (ch7_12_Child)parent;
		System.out.println("methed2 - Child로 변환 성공");
	}

	
	public static void main(String []args) {
		/*
		 * 객체 타입 확인을 위한 instanceof 연산자
		 * 강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자
		 */
		//Parent 타입의 변수를 선언해서 Child 객체를 대입
		ch7_12_Parent p1 = new ch7_12_Child();/*<--객체*/
		//method 1,2 를 각각 호출
		method1(p1);//성공
		method2(p1);//성공
		//Parent 타입의 변수를 선언해서 Parent 객체를 대입
		//method 1,2를 각각 호출
		ch7_12_Parent p2 = new ch7_12_Parent();
		method1(p2);//오류는 없지만 변환은 안돰
		method2(p2);//오류
	}
}
