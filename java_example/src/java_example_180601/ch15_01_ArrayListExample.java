package java_example_180601;

import java.util.List;
import java.util.ArrayList;

//ArrayList 예제
public class ch15_01_ArrayListExample {

	public static void main(String[] args) {
		//ArrayList 선언
		List<String> list = new ArrayList<String>();
		//<>제네릭(Generic) : 번거로운 타입변환을 제거해주는 역할
		
		/* 제네릭을 쓰지않고 리스트에 값을 넣을경우
		 * List list = new ArrayList();
		 * list.add("홍기롣ㅇ");
		 * object obj = list.get(0);
		 * String name = (String)obj;
		 * object 타입 = 테이터를 담을수 있는 최상위 클래스
		 */
		/*list.add("홀딩동");
		String name = list.get(0);
		System.out.println(name);*/
		//리스트 객채에 데이터 저장하는 메소드 add()
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		//2번인덱스에 데이터베이스를 집어 넣겟다.그러면 기존 2번에 있는 jsp는 3번으로 밀림
		list.add("myBatis");
		
		int size = list.size();
		System.out.println("list의 크기"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번 인덱스에 담긴 데이터 :"+skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++)
			{System.out.println(list.get(i));}
		System.out.println();
		//list에 담긴 데이터 삭제
		list.remove(2);//Database 삭제
		//데이터베이스가 지워지면 앞에 내용들이 땡겨져서 2번에눈 jsp에 담겨짐
		list.remove(2);//jsp삭제
		list.remove("JDBC");
		for(int i=0;i<list.size();i++)
			{System.out.println(list.get(i));}
		
	}

}
