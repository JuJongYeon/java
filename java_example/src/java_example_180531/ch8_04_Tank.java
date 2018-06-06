package java_example_180531;

public class ch8_04_Tank implements ch8_04_Car,ch8_04_Cannon{

	@Override
	public void fire() {
		System.out.println("대포발싸");
	}

	@Override
	public void work() {
		System.out.println("sss");
	}

}
