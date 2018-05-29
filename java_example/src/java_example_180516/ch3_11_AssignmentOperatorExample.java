package java_example_180516;
//대입연산자 예제
/*
 * +=,-=,/=,*=
 * A=+B
 * num1= num1 + num2
 */
public class ch3_11_AssignmentOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		result += 10; //result = result + 10
		System.out.println("result=" + result);//10
		
		result -= 5; //result = result - 5
		System.out.println("result=" + result);//5

		result *= 3;//result = result * 3
		System.out.println("result=" + result);//15
		
		result /= 5;//result = result / 5
		System.out.println("result=" + result);//3
		
		result %= 3;//result = result % 3 ,3으로 나누고 남은 나머지값
		System.out.println("result=" + result);//0 

	}

}
