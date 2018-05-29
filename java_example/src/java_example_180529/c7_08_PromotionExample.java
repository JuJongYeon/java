package java_example_180529;
//자동타입변환 예제(자식클래스타입 -> 부모클래스타입)

//A클래스 선언
class A {
	
}
//A클래스의 자식인 B클래스 선언
class B extends A {
	
}
//A클래스의 자식인 C클래스 선언
class C extends A {
	
}
//B클래스의 자식인 D클래스 선언
class D extends B {
	
}
//C클래스의 자식클래스인 E 클래스 선언
class E extends C{
	
}

public class c7_08_PromotionExample {
	public static void main (String [] args) {
		//B클래스 타입의 변수 b선언
		B b=new B();
		//C클래스 타입의 변수 c선언
		C c =  new C();
		//D클래스 타입의 변수 d선언
		D d = new D();
		//E클래스 타입의 변수 e선언
		E e = new E();
		
		//각각 선언한 변수들에 대한 자동형변환여부 확인
		//A클래스 타입의 변수에 B클래스 타입 변수 대입
		A a1 =b;
		A a2 =c;
		A a3 =d;
		A a4 =e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;
		//C c2 = d;
		
		//A부모클래스는 B클래스로 강제형변환 해줘야한다
		B b3 = (B)a1;
		
		
	}
}
