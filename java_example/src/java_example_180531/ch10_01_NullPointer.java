package java_example_180531;

public class ch10_01_NullPointer {
	public static void main(String []args) {
		try {
		String data=null;
		System.out.println("????????????????");
		System.out.println(data.toString());
		System.out.println("????????????????");
		//toString 변수가 가지고 있는 값을 문자열로 변환 작성하게 해줌
		System.out.println(data);
		System.out.println("????????????????");

		}
		catch(NullPointerException i) {
			System.out.println("예외가 발생했으니 코드를 확인해 볼것");
		}
	}
}
