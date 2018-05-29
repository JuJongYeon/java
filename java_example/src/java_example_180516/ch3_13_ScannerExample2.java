package java_example_180516;
import java.util.Scanner;
public class ch3_13_ScannerExample2 {
//이름 도시 나이 체중을 빈칸으로 분리하여 입력하세요
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		System.out.print("당신의 이름을 입력해주세요:");
		name = s.next(); 
		
		String lo;
		System.out.print("당신이 사는 지역을 입력해주세요:");
		lo = s.next();
		
		int age;
		System.out.print("당신의 나이를 입력해주세요:");
		age = s.nextInt();
		
		double kg;
		System.out.print("당신의 체중을 입력해주세요:");
		kg = s.nextDouble();
		
		System.out.println("당신의 이름은" + name + "입니다.");
		System.out.println("당신이 사는 지역은" + lo + "입니다.");
		System.out.println("당신의 나이를" + age + "입니다.");
		System.out.println("당신의 체중은" + kg + "입니다.");
		s.close();

	}

}
