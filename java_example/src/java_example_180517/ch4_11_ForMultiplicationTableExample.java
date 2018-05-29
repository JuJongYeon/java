package java_example_180517;
//중첩 for문을 이용한 구구단 출력하기
public class ch4_11_ForMultiplicationTableExample {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단출력하기");
			for(int j=1; j<=9;j++) {
				System.out.print(i+"x"+j+"="+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
