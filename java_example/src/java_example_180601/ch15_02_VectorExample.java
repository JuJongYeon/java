package java_example_180601;

import java.util.*;

public class ch15_02_VectorExample {

	public static void main(String[] args) {
		List<ch15_02_Board> list = new Vector<ch15_02_Board>();
		
		list.add(new ch15_02_Board("제목1","글내용","사용자1"));
		list.add(new ch15_02_Board("제목2","글내용","사용자2"));
		list.add(new ch15_02_Board("제목3","글내용","사용자3"));
		list.add(new ch15_02_Board("제목4","글내용","사용자4"));
		list.add(new ch15_02_Board("제목5","글내용","사용자5"));
		
		int size = list.size();
				
		for(int i=0;i<list.size();i++) {
			ch15_02_Board b = list.get(i);
			//ch15_02_Board b = new ch15_02_Board("제목1","글내용","사용자1");
			System.out.println(b.subject+"\t");
			System.out.println(b.content+"\t");
			System.out.println(b.writer+"\t");
			}
		}
	}

