package java_example_180529;
//Tire클래스를 상속받은 클래스
public class ch7_09_KumhoTire extends ch7_09_Tire{
	public ch7_09_KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
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
