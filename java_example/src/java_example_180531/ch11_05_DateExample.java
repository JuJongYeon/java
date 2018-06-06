package java_example_180531;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date 클래스 예제
public class ch11_05_DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
