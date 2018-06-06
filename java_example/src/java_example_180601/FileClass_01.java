package java_example_180601;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileClass_01 {
	public static void main(String [] args) {
		//기존 파일응ㄹ 새로운 파일로 저장하기
		//기존 파일에 대한 객체 생성
		File rfile = new File("D:\\test\\testfile.txt");
		//새롭게 만든 파일에 대한 객체 생성
		File wfile = new File("D:\\test\\testfile_new.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(wfile));
			
			String s;
			while((s=reader.readLine()) != null) {
				//기존에 있던 파일에 내용을 읽에 s에 저장
				writer.write(s+"-새로 쓰여진 파일");
				//s에 저장된 내용 및 추가 문자열을 새로운 파일인 wfile에 저장
			}
		reader.close();
		writer.close();
		rfile.delete();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("새로 쓰기 완료");
	}
}
