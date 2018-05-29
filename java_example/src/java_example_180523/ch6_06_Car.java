package java_example_180523;
//생성자(Constructor) Overloading 에
public class ch6_06_Car {
	//field 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//여러종류의 생성자 선언해보기
	/*
	 * 1. 기본생성자
	 * 2.model 을 매개변수로 하는 생성자
	 * 3.model,color를 매개변수로 하는 생성자
	 * 4.model,color,maxSpeed를 매개변수로 하는 생성자
	 */
	//기본생성자 선언
	ch6_06_Car(){
		this("안녕하세오.","만나서 반가워오",500);
	}
	//model 을 매개변수로 하는 생성자
	/*ch6_06_Car(String m){
		model=m;
	}*/
	ch6_06_Car(String model){
		/*this.model=model;*/
		this(model,"은색",300);
		//현재 클래스에 있는(String,String,int)형태의 생성자를 호출하여 매개값을 넘길때 사용하는 this()방법
	}
	
	ch6_06_Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	ch6_06_Car(String model,String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed = maxSpeed;
	}
	
}
