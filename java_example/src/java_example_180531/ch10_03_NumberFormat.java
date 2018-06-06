package java_example_180531;

public class ch10_03_NumberFormat {

	public static void main(String[] args) {
		//NumberFormatException
		//문자열을 숫자로 변환할 때 발생하는 예외
		String data1 = "100";
		String data2 = "a100";
		
		//문자열을 숫자로 변환
		///parseInt의 메게변수는 스트링
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		int value2 = Integer.parseInt(data2);
		System.out.println(value2);
		int result = value1+value2;
		System.out.println(result);
	}
}
