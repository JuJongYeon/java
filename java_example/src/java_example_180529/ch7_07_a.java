package java_example_180529;
//protected접근자:다른 패키지에 소속되어 있는 클래스는 접근 불가능
/*
 * A클래스
 * 접근제한자가 protected인 필드, 생성자, 메소드 선언
 * B클래스 
 * 메소드를 선언해서
 * a클래스의 객체만들고 a클래스의 필드,메소드에 접근 가능한지 확인
 * c클래스는 다른패키지에서 선언
 * A클래스 포함시키고 a클래스의 객체만들고 a클래스의 필드,메소드에 접근 가능한지 확인
 * D클래스는 C클래스와 동일한 패키지에 선언
 * A클래스 포함시키고 A클래스 상속받고 
 * 생성자를 선언해서 부모 클래스의 필드와 메소드에 접근 가능한지 확인
 */
public class ch7_07_a {
	protected int i;
	
	protected ch7_07_a() {
		
	}
	
	protected int getI() {
		return i;
	}

	protected void setI(int i) {
		this.i = i;
	}

	protected ch7_07_a(int i) {
		this.i=i;
	}
	
	protected void isum () {
		System.out.println(i+i);
	}
}
