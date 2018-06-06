package java_example_180601;

import java.util.*;

//Map예제
public class ch15_04_MapExample {

	public static void main(String[] args) {
		//인덱스 값대신 키값을 사용
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("학생1", 123);
		map.put("학생2", 456);
		map.put("학생3", 789);
		map.put("학생4", 10);
		map.put("학생5", 20);
		
		System.out.println(map.size());
		
		//특정 데이터 찾기
		System.out.println(map.get("학생1"));
		
		//데이터 삭제시 키값을 쓰면댐
		//map.remove("학생1");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}		
	}
}
