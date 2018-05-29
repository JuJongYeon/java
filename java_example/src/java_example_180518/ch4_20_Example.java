package java_example_180518;
/*
 * 문제: 방정식 2x+4y=10의 모든 해를 구하시오
 * 0<=x,y<=10 이고 모두 정수이다.
 */
public class ch4_20_Example {

	public static void main(String[] args) {
		int sum=0;
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(2*x+4*y==10) {
					System.out.println("x="+x+"\t"+"y="+y);
				}
			}
		}
	}
}
