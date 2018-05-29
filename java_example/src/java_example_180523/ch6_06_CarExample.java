package java_example_180523;

public class ch6_06_CarExample {

	public static void main(String[] args) {
		//1.기본 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_06_Car c1 = new ch6_06_Car();
		//2.model 매개변수를 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_06_Car c2 = new ch6_06_Car("현대");
		//3.model,color 매개변수를 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_06_Car c3 = new ch6_06_Car("볼보","흰색");
		//4.model,color,maxSpeed 매개변수를 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		ch6_06_Car c4 = new ch6_06_Car("지프","흰색",250);
		System.out.println("---------------------");
		System.out.println(c1.company+"  "+c1.model+"  "+c1.color+"  "+c1.maxSpeed);
		System.out.println("---------------------");
		System.out.println(c2.company+"  "+c2.model+"  "+c2.color+"  "+c2.maxSpeed);
		System.out.println("---------------------");
		System.out.println(c3.company+"  "+c3.model+"  "+c3.color+"  "+c3.maxSpeed);
		System.out.println("---------------------");
		System.out.println(c4.company+"  "+c4.model+"  "+c4.color+"  "+c4.maxSpeed);
		System.out.println("---------------------");
	}
}
