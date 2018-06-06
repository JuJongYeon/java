package java_example_180601;

import java.util.*;

public class ch15_03_HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("myBatis");
		set.add("Java");//데이터 중복괸 값이 들어오게 되면 1개로 처리함
		
		int size = set.size();
		System.out.println("set에 담긴 총 데이터 수"+size);
		
		//Set에 들어있는 모든 데이터 가져오기
		//반복자 Iterator를 사용 
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("JDBC");
		
		//set에 있는 내용을 전체 삭제
		set.clear();
		
		set.isEmpty();
		//set이 비어있는지 확인하는 메소드
	}
}
