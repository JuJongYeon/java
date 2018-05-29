package java_example_180516;

public class ch3_8_StringEaualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "본인이름";
		String strVar2 = "본인이름";
		//new 연산자 : 새로운 객체를 생설할떄 사용하는 연산자
		String strVar3 = new String("본인이름");
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		//내용은 같지만 원천적으로 다르기 때문에 다르게 인식된다.
		System.out.println();
		//.equals()
		//문자열을 비교할때 사용되는 문법 ? 연산자 ?
		System.out.println(strVar1.equals("본인이름"));
		System.out.println(strVar1.equals(strVar3));
		

	}

}
