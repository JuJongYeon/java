package java_example_180529;

public class ch7_09_HanKookTire extends ch7_09_Tire{
	public ch7_09_HanKookTire(String location, int maxPotation) {
		super(location, maxPotation);
	}
	@Override
	public boolean roll() {
		++accmulatedRotaion;
		if(accmulatedRotaion<maxRotaion) {
			System.out.println(location+"Tire 수명:"+(maxRotaion-accmulatedRotaion)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
	}
}
