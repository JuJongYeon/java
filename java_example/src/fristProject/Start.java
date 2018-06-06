package fristProject;

import java.util.*;

public class Start extends local{

	
	Scanner scan = new Scanner(System.in);
	
	local l = new local();
	String lo;
	
	public void st() {
		while(true) {
			System.out.println("================낚시 게임================");
			System.out.println("1.지역선택 2.낚시시작 3.내물고기list 4.게임종료");
			System.out.println("======================================");
			System.out.print("매뉴선택>");
			int s = scan.nextInt();
			if(s==1) {
				System.out.println("지역을 선택하세요.");
				System.out.println("1.서해안 2.계곡 3.아마존");
				System.out.print("지역선택>");
				lo = scan.next();
				if(lo.equals("서해안")) {
					System.out.println("서해안 지역으로 이동합니다.");
				}
				else if(lo.equals("계곡")) {
					System.out.println("계곡 지역으로 이동합니다.");
				}
				else if(lo.equals("아마존")) {
					System.out.println("아마존 지역으로 이동합니다.");
				}
			}else if(s==2 && lo.equals("서해안")) {
				System.out.println("낚시를 시작합니다.");
				System.out.println("사용하실 낚싯대를 선택해주세요.");
				System.out.println("1.대나무 | 2.플라스틱 | 3.알루미늄 | 4.초합금");
				int dea = scan.nextInt();
				if(dea==1) {
					System.out.println("대나무 낚싯대를 선택하셨습니다.");
				}else if(dea==2) {
					System.out.println("플라스틱 낚싯대를 선택하셨습니다.");
				}else if(dea==3) {
					System.out.println("알루미늄 낚싯대를철  선택하셨습니다.");
				}else if(dea==4) {
					System.out.println("초합금 낚싯대를 선택하셨습니다.");
				}
				System.out.println("사용하실 미끼를 선택해주세요.");
				String miki = scan.next();
				System.out.println(miki+"미끼를 선택하셨습니다.");
				l.setLocal1();
			}else if(s==2 && lo.equals("계곡")) {
				System.out.println("낚시를 시작합니다.");
				System.out.println("사용하실 낚싯대를 선택해주세요.");
				System.out.println("1.대나무 | 2.플라스틱 | 3.알루미늄 | 4.초합금");
				int dea = scan.nextInt();
				if(dea==1) {
					System.out.println("대나무 낚싯대를 선택하셨습니다.");
				}else if(dea==2) {
					System.out.println("플라스틱 낚싯대를 선택하셨습니다.");
				}else if(dea==3) {
					System.out.println("알루미늄 낚싯대를철  선택하셨습니다.");
				}else if(dea==4) {
					System.out.println("초합금 낚싯대를 선택하셨습니다.");
				}
				System.out.println("사용하실 미끼를 선택해주세요.");
				String miki = scan.next();
				System.out.println(miki+"미끼를 선택하셨습니다.");
				l.setLocal2();
			}else if(s==2 && lo.equals("아마존")) {
				System.out.println("낚시를 시작합니다.");
				System.out.println("사용하실 낚싯대를 선택해주세요.");
				System.out.println("1.대나무 | 2.플라스틱 | 3.알루미늄 | 4.초합금");
				int dea = scan.nextInt();
				if(dea==1) {
					System.out.println("대나무 낚싯대를 선택하셨습니다.");
				}else if(dea==2) {
					System.out.println("플라스틱 낚싯대를 선택하셨습니다.");
				}else if(dea==3) {
					System.out.println("알루미늄 낚싯대를철  선택하셨습니다.");
				}else if(dea==4) {
					System.out.println("초합금 낚싯대를 선택하셨습니다.");
				}
				System.out.println("사용하실 미끼를 선택해주세요.");
				System.out.println();
				String miki = scan.next();
				System.out.println(miki+"미끼를 선택하셨습니다.");
				l.setLocal3();
			}
			else if(s==3) {
				
				}
			else if(s==4) {
				System.out.println("낚시 게임을 종료합니다.감사합니다");
				System.exit(0);
				}
			}
		}
	}
