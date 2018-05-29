package java_example_180516;
//증감연산자 예제
/* ++,--
 * 변수 앞에 ++이 붙으면 1을 증가시키고 계산에 사용 ++x
 * 변수 뒤에 ++이 붙으면 일단 변수값을 사용하고 1응 증가시켜 놓음. x++*/
public class ch3_2_IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		System.out.println("--------------------------------");
		System.out.println("x="+x);
		x++;//x=11 y=10 z=null
		//x값을 사용하고 x값을 1증가 시켜놓음
		System.out.println("x="+x);
		++x;//x=11 y=10 z=null
		//++은 기존 x값에서 1을 증가시키고 사용
		System.out.println("x="+x);
		System.out.println("--------------------------------");
		
		System.out.println("y=" + y);
		y--;//x=12 y=9 z=null
		System.out.println("y=" + y);
		--y;//x=12 y=8 z=null
		System.out.println("y=" + y);
		System.out.println("--------------------------------");
		
		z = x++;//x=13 y=8 z=12
		//x가 가지고 있는 값을 먼저 z에 대입하고 x값을 1증가시킴
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------------------------");
		
		z = ++x + y++;//x=14 y=8 z=22
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
