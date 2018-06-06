package java_example_180530_2;

public class Sedan extends Car{
	
	Sedan(int speed, String color) {
		super(speed, color);
	}

	@Override
	public void trunk() {
		System.out.println("Sedan은 사람을 실을수 잇읍니다.");
	}
}
