package java_example_180516;

public class ch3_6_CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 비교연산자의 종류
		 * 비교연산자는 연산 결고가가 무조건 true, false로 나옴
		 * == : 양변이 같으면 결과는 true, 다르면 false
		 * != : 양변이 다르면 결과는 true, 같으면 false
		 * >,>=,<,<=
		 * 5>3 : true*/
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //트루
		boolean result2 = (num1 != num2); //풜스
		boolean result3 = (num1 <= num2); //트루
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);//트루
		System.out.println("result4="+result4);
	}

}
