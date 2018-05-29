package java_example_180529;

public class ch7_09_Car1 {
	//필드
	//각 필드는 Tire클래스 타입으로 선언됨
	ch7_09_Tire forntlefttire = new ch7_09_Tire("앞왼쪽",6);
	ch7_09_Tire forntrighttire = new ch7_09_Tire("앞오른쪽",2);
	ch7_09_Tire backlefttire = new ch7_09_Tire("뒤왼쪽",3);
	ch7_09_Tire backrighttire = new ch7_09_Tire("뒤오른쪽",4);
	//위의 내용을 배열로 
	ch7_09_Tire[] tire = new ch7_09_Tire[4];
	ch7_09_Tire[] tire1 = {};
	ch7_09_Tire[] tire2 = {
			new ch7_09_Tire("앞왼쪽",6),
			new ch7_09_Tire("앞오른쪽",2),
			new ch7_09_Tire("뒤왼쪽",3),
			new ch7_09_Tire("뒤오른쪽",4)
	};
	//ch7_09_Tire[0] = new ch7_09_Tire("앞왼쪽",6);
	//ch7_09_Tire[1] = new ch7_09_Tire("앞오른쪽",2);
	//ch7_09_Tire[2] = new ch7_09_Tire("뒤왼쪽",3);
	//ch7_09_Tire[3] = new ch7_09_Tire("뒤오른쪽",4);
	
	//메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if(forntlefttire.roll()==false) {
			stop();
			return 1;
		}
		if(forntrighttire.roll()==false) {
			stop();
			return 2;
		}
		if(backlefttire.roll()==false) {
			stop();
			return 3;
		}
		if(backrighttire.roll()==false) {
			stop();
			return 4;
		}
		
		return 0;
	}
void stop() {
	System.out.println("자동차가 멈춥니다.");
}
	
	
	
}
