package java_example_180601;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//io : 입출력과 관련된 클래스
public class FileClass {

	public static void main(String[] args) {
		//파일(텍스트파일)을 생성하고 내용을 쓰기
		//저장경로로 사용하기 위한 변수 선언
		String path = "D:\\test\\testfile.txt";
		//파일 객체 생성
		File file = new File(path);
		
		try {
			FileWriter fw = new FileWriter(file);
			//FileWriter = file 에다가 반복문의 내용을 쓰게해주는 실질적인 객체?클래스?
			for (int i='A';i<='Z';i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("쓰기 완료 ..");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
