package java_example_180531;

public class ch10_01_ArrayIndexOutOfBounds {
	public static void main(String []args) {
	try {	
	int[] arr = {1,2,3};
	System.out.println(arr[1]);
	}catch(ArrayIndexOutOfBoundsException 병신) {
		System.out.println("뭔가 틀림");
		}
	finally {
		System.out.println("finally는 무조건 실행됩니다.");
	}
	}
}
