package java_example_180514;

public class FloatDoubleExample {
	public static void main(String [] args) {
		
		/*
		 * 실수형 변수를 선언하는 타입 double(8바이트), float(4바이트)
		 * 자바는 기본 실수 값을 double 타입으로 인지하기 때문에 float 타입의 변수에
		 * 실수를 담기 위해선 값의 끝에 F를 붙여야함.
		 */
		double var1 = 3.14;
		/*int var2 = 3.14; //에러
*/		float var3 = 3.14F;
		
		double var7 = 3e6; //3x10^6, e=승수
		float var8 = 3e6f;
		double var9 = 2e-3;
		
		System.out.println("var1 :"+var1);
		/*System.out.println("var2 :"+var2);*/
		System.out.println("var3 :"+var3);
		System.out.println("var7 :"+var7);
		System.out.println("var8 :"+var8);
		System.out.println("var9 :"+var9);
	}

}
