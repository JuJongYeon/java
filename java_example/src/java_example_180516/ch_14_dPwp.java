package java_example_180516;
import java.util.Scanner;

//원의 반지름을 입력하세요:
//원의 면적은 9498.5입니다.
public class ch_14_dPwp {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		double r;
		//double p = 3.14;
		
		System.out.print("원의 반지름을 입력하세요:");
		r = s.nextDouble();
		System.out.println("원의 면적은" + r*r*Math.PI + "입니다.");
		//Math.PI = 파이 3.14
	}

}
