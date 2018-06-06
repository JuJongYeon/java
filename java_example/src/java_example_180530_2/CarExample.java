package java_example_180530_2;

public class CarExample {

	public static void main(String[] args) {
		Sedan s =new Sedan(150, "흰색");
		Truck t = new Truck(150,"주황색");
		
		
		System.out.println("세단의 차 색은"+s.color+"이고 시속은 현제 "+s.speed+"로 이동하고있습니다.");
		s.trunk();
		
		System.out.println("세단의 차 색은"+t.color+"이고 시속은 현제 "+t.speed+"로 이동하고있습니다.");
		t.trunk();
	}
}
