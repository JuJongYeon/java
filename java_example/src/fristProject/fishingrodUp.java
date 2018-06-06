package fristProject;

import java.util.*;

import java_example_180525.ch6_26_Account;

public class fishingrodUp {
	String rod;
	int r =(int)(Math.random()*100)+1;
	
	Scanner scan = new Scanner(System.in);
	
	public void rodUp(){
		while(true) {
		System.out.println("낚싯대 강화를 시작합니다.");
		System.out.println("강화하실 낚싯대를 선택해주세요.");
		System.out.println("1.대나무 낚싯대 | 2.플라스틱 낚싯대 | 3.알루미늄 낚싯대");
		System.out.print("선택>");
		int s = scan.nextInt();
		if(s==1) {
			System.out.println("대나무 낚싯대를 선택하셨습니다.");
			first();
		}else if(s==2) {
			System.out.println("플라스틱 낚싯대를 선택하셨습니다.");
			second();
		}else if(s==3) {
			System.out.println("알루미늄 낚싯대를철  선택하셨습니다.");
			third();
		}else if(s==4) {
			System.out.println("초합금 낚싯대를 선택하셨습니다.");
			fourth();
		}
		}
	}
	public void first() {
		ch6_26_Account[] account = new ch6_26_Account[100];
	}
	public void second() {
		
	}
	public void third() {
		
	}
	public void fourth() {
		
	}
}