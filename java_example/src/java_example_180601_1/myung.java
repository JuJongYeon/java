package java_example_180601_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myung {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner scan =new Scanner(System.in);
		
		//리스트에 5명의 사람이름 입력하기
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력하세요:");
			String name = scan.next();
			list.add(name);}
		
		//입력된 사람들의 이름출력하기
		for(int i=0;i<list.size();i++) {
			System.out.println(i+1+"학생들 이름:"+list.get(i));
			}
		
		//입력된 이름 중 가장 긴이름 출력하기
		int max=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(max).length() < list.get(i).length()) {
				max=i;
			}
		}System.out.println("가장긴 이름의 학생:"+list.get(max));
	}
}
