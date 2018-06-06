package java_example_180531_2;

public class CountableExample {
	public static void main(String[] args) {
		Countable[] m = {new Bird("뻐꾸기"),new Bird("독수리")
				,new Tree("사과나무"),new Tree("밤나무")};
		
		//m = Countable 인터페이스 타입의 변수
		//Countable e = 반복변수,m의 값을 하나씩 e에 대입
		for(Countable e: m) {
			/*
			 * 첫번쨰 반복문 e=m[0] = new Bird("뻐꾸기")
			 * 뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
			 */
			e.count();}
		
		for(int i=0;i<m.length;i++) {
			//타입에 따라 fly() 또는 ripen() 메서드 호출 => instanceof
			//조건문을 이용해서 배열에 저장된 각 요소가 Bird클래스 타입인지 확인
			//비교 하고자 하는 변수 instanceof 비교에 쓸 대상
			
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly();
			}else if(m[i] instanceof Tree) {
				((Tree)m[i]).ripen();
			}
			/*Bird b = new Bird(null);
			b=(Bird) m[i];
			b.fly();*/
			
			/*Tree t = new Tree(null);
			t=(Tree)m[i];
			t.ripen();*/
		}
	}
}
