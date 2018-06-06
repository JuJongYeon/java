package java_example_180530;

public class ch7_14_Cat extends ch7_14_Animal{
	public ch7_14_Cat() {
		this.kind="포유류";
	}
	
	
	@Override
	public void sound() {
		System.out.println("미야옹");
	}
}
