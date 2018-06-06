package java_example_180530_2;

public class Truck extends Car{
	Truck(int speed, String color) {
		super(speed, color);
	}

	@Override
	public void trunk() {
		System.out.println("Truck은 짐을 실을수 잇읍니다.");
	}
}
