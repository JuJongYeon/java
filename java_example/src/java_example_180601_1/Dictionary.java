package java_example_180601_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Dictionary {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		map.put("jujongyeon","주종연이라는 사람");
		map.put("packgisick","박기식이라는 사람");
		map.put("guyoungmo", "구영모라는 사람");
		map.put("computer",
				"전자 회로를 이용한 고속의 자동 계산기. 숫자 계산, 자동 제어, 데이터 처리, 사무 관리, 언어나 영상 정보 처리 따위에 광범위하게 이용된다.");
		map.put("java", "네트워크상에서 쓸 수 있도록 미국 선 마이크로시스템(Sun Microsystems)사에서 개발한 객체 지향 프로그래밍 언어");
		
		while(true) {
		System.out.println("사전 검색을 시작합니다.");
		System.out.println("단어를 검색하세요");
		String name = scan.next();
		
		String k = map.get(name);
		if(k == null) {
			System.out.println("다시 입력해주세요");
		}else{
			System.out.println(name+"의 뜻은 : "+map.get(name));
			}
		}
	}
}
