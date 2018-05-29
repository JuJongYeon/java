package java_example_180525;

import java.util.Scanner;

public class ch6_22_student {
	String st;
	Scanner scan = new Scanner (System.in);
	int gu;
	int su;
	int yu;

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public int getGu() {
		return gu;
	}

	public void setGu(int gu) {
		this.gu = gu;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getYu() {
		return yu;
	}

	public void setYu(int yu) {
		this.yu = yu;
	}

	void result() {
		System.out.print("학생의 이름을 입력해주세요:");
		st=scan.next();
		System.out.print("국어점수를 입력하세요.:");
		gu=scan.nextInt();
		System.out.print("수학점수를 입력하세요.:");
		su=scan.nextInt();
		System.out.print("영어점수를 입력하세요.:");
		yu=scan.nextInt();
		int sum=0;
		sum+=getGu()+getSu()+getYu();
		int avg =sum/3;
		System.out.println(st+"의"+"평균성적"+avg);
		
		}
}