package java_example_180528;

public class ch7_04_SuperSonicAirplaneExample {

	public static void main(String[] args) {
		ch7_04_SuperSonicAirplane p = new ch7_04_SuperSonicAirplane();
		p.takeOff();
		p.fly();
		p.flyMode=ch7_04_SuperSonicAirplane.SUPERSONIC;
		p.fly();
		p.flyMode=ch7_04_SuperSonicAirplane.NORMAL;
		p.fly();
		p.land();
	}
}
