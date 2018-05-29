package java_example_180517;

public class ch4_15_BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			//주사위가 6이 나왔을 떄 반복문종료
			if(num==6) {
				break;
			}
		}
		System.out.println("반복문 종료됨.");
	}

}
