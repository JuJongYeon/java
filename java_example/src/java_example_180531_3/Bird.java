package java_example_180531_3;

public class Bird extends Countable{
		
	Bird(String name, int num){
		super(name, num);
	}
	
	void fly() {
	System.out.println(num+"마리"+name+"가 날아갔다.");
	}

	@Override
	void count() {
	System.out.println(name+"가"+num+"마리 있다.");
	}
}
