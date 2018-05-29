package java_example_180523;
//method 연습 예제 p.217
public class ch6_07_Calculator {
	//method 선언
	//메소드 이름 : PowerOn
	//메소드 리턴 타입 : void
	/*메소드 리턴 타입->*/void /*메소드 이름->*/PowerOn() {
		System.out.println("전원을 켭니다.");
		for(int i=0;i<=10;i++) {
			System.out.println(i+i);
		}
	}
	public/*리턴타입->*/int plus(int x, int y) {	//x,y값이 담기고
				int result = x+y;				//result라는 변수안에 x+y값을 담고 
				return result;		//리턴 타입과 넘겨주는 변수의 타입과 같아야함
	}
	
	double divide(double x, double y) { //x,y값이 담기고
		double result =(double)x/(double)y;//result 안에
		return result;
	}
	void PowerOff() {
		System.out.println("전원을 끕니다.");
	}
}
