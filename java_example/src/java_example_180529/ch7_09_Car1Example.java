package java_example_180529;
//필드의 다향성 예제
public class ch7_09_Car1Example {
	public static void main(String []args) {
		//Car클래스 타입의 변수 car선언
		ch7_09_Car1 car = new ch7_09_Car1();
		
		//부모클래스 타입의 변수 선언
		ch7_09_Tire tire = new ch7_09_Tire("aaa",10);
		//자식클랫 타입의 변수선언
		ch7_09_HanKookTire hktire = new ch7_09_HanKookTire("한국",10); 
		tire = hktire; //자식클래스 타입 변수를 부모클래스 타입변수에 대입
		hktire = (ch7_09_HanKookTire) tire; //부모클래스 타입 변수를 자식클래스 타입 변수에 대입
		
		
		
		for(int i=1;i<=100;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HanKookTire로 교체");
				car.forntlefttire = new ch7_09_HanKookTire("HanKookTire앞왼쪽",9);
				break;
			
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.forntrighttire = new ch7_09_KumhoTire("KumhoTire앞오른쪽",8);
				break;
				
			case 3:
				System.out.println("뒤왼쪽 HanKookTire로 교체");
				car.backlefttire = new ch7_09_HanKookTire("HanKookTire뒤왼쪽",7);
				break;
				
			case 4:
				System.out.println("뒤오른족 KumhoTire로 교체");
				car.backrighttire = new ch7_09_KumhoTire("KumhoTire뒤오른쪽",6);
				break;
			}
			System.out.println("--------------------------");
		}
	}
}
