package java_example_180529;

public class ch7_10_Main {

	public static void main(String[] args) {
		ch7_10_Sedan s = new ch7_10_Sedan("빨간색",200,5);
		System.out.println(s.color+"승용차의 속도는"+s.speed+"이고"+"좌석은"+s.ja(s.suck)+"개 입니다.");
		
		
		System.out.println("=============================");
		System.out.println("=============================");
		
		ch7_10_Truck t = new ch7_10_Truck("검정색",100,5);
		System.out.println(t.color+"트럭의 속도는 "+t.speed+"이고"+"적재량은"+t.jea(t.juck)+"톤 입니다.");
		
	}
}