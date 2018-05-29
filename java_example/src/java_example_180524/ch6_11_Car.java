package java_example_180524;

public class ch6_11_Car {
	//필드선언
	String model;
	
	//생성자 선언 (생성자의 이름은 클래스의 이름과 동일하게 선언)
	ch6_11_Car(String model){
		//넘겨받은 매개변수 값을 현재 필드에 저장
		this.model=model;
	}
	void run () {
		//for(int i=10;i<=50;i+=10;) => 10씩 증가
		for(int i=1;i<=10;i++) {
			int k=i*10;
			System.out.println(model+"가 달립니다."+"(시속:"+k+"km/h)");
		}
	}
	/*int k(int i){
		int result = i*10;
		i++;
		return result;
	}*/
	
	/*void run() {
		int rusult = 5;
		println(model+"가 달립니다."+"시속:"++"km/h");
	}*/
	
}
