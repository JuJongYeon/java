package java_example_180525;

import java.util.Scanner;

public class ch6_24_AbsValue {
	int x;
	int y;
	int a;
	int b;
	int k;
	Scanner scan = new Scanner(System.in);
	public double g (int x,int y,int a,int b){
		double result=Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
		return result;
	}
	public int abs (int k) {
		int result = Math.abs(k);
		return result;
	}
	public void stt() {
		while(true) {
			int s=0;
			System.out.println("--------------------");
			System.out.println("수행할 내용을 선택하세요.");
			System.out.println("1. 두점 사이의 거리 구하기");
			System.out.println("2. 절대값 구하기");
			System.out.println("선택>>");
			s = scan.nextInt();
			if(s==1) {
				System.out.println("두 점을 (x,y)순으로 입력하세요.");
				System.out.print("첫번째 x 좌표:");
				this.x = scan.nextInt();
				System.out.print("첫번째 x 좌표:");
				this.y = scan.nextInt();
				System.out.print("두번째 y 좌표:");
				this.a = scan.nextInt();
				System.out.print("두번째 y 좌표:");
				this.b = scan.nextInt();
				System.out.println("두점 사이의 거리는"+this.g(this.x, this.y, this.a, this.b)+"입니다.");
			}
			else if(s==2) {
				System.out.println("정수를 입력해주세요.");
				this.k = scan.nextInt();
				System.out.println("입력하신 정수의 절대앖은"+this.abs(this.k)+"입니다.");
			}	
		}
	}
}
