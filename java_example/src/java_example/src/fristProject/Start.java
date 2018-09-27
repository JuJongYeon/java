package fristProject;

import java.util.*;
//낚시 게임 메뉴를 선택하고 메소드를 실행하는 메소드
public class Start {
	
	Scanner scan = new Scanner(System.in);
	//각 local별로 객체 생성
	local l = new local();
	local2 l2 = new local2();
	local3 l3 = new local3();
	
	//memo 클래스의 객체 생성
	memo l4 = new memo();
	
	//지역선택 변수
	int lo;
	
	//낚시 게임 실행에 대한 메소드
	public void st() {
		while(true) {
			System.out.println("=====================낚시 게임=====================");
			System.out.println("1.지역선택 2.낚시시작 3.내물고기list 4.물고기도감 5.게임종료");
			System.out.println("================================================");
			System.out.print("매뉴선택>");
			int s = scan.nextInt();
			//1번 지역선택
			if(s==1) {
				System.out.println("===============");
				System.out.println("지역을 선택하세요.");
				System.out.println("===============");
				System.out.println("1.서해안 2.계곡 3.아마존");
				System.out.print("지역선택>");
				lo = scan.nextInt();
				//각 지역별로 선택
				if(lo==1) {
					System.out.println("서해안 지역으로 이동합니다.");
				}
				else if(lo==2) {
					System.out.println("계곡 지역으로 이동합니다.");
				}
				else if(lo==3) {
					System.out.println("아마존 지역으로 이동합니다.");
				}
				//2(낚시시작)번을 선택하면 1번 에서 선택한 정보를 받아서 이어감
				//1번에서 1번(서헤안)을 선택하고 메뉴로 돌아와 2번(낚시시작)을 선택하면 서해안에 대한 낚시게임이 시작
			}else if(s==2 && lo==1) {
				System.out.println("낚시를 시작합니다.");
				System.out.println("사용하실 낚싯대를 선택해주세요.");
				System.out.println("1.대나무 | 2.플라스틱 | 3.알루미늄 | 4.초합금");
				//낚싯대를 선택하기위한 변수 선언
				int dea = scan.nextInt();
				if(dea==1) {
					System.out.println("대나무 낚싯대를 선택하셨습니다.");
				}else if(dea==2) {
					System.out.println("플라스틱 낚싯대를 선택하셨습니다.");
				}else if(dea==3) {
					System.out.println("알루미늄 낚싯대를  선택하셨습니다.");
				}else if(dea==4) {
					System.out.println("초합금 낚싯대를 선택하셨습니다.");
				}
				System.out.println("사용하실 미끼를 선택해주세요.");
				System.out.println("1.점심밥 | 2.떡밥 | 3.지렁이 | 4.루어");
				//미끼를 선택하기 위한 변수 선언
				int miki = scan.nextInt();
				if(miki==1) {
					System.out.println("점심밥을 미끼로 선택하셨습니다.");
				}else if(miki==2) {
					System.out.println("떡밥을 미끼로  선택하셨습니다.");
				}else if(miki==3) {
					System.out.println("지렁이를 미끼로  선택하셨습니다.");
				}else if(miki==4) {
					System.out.println("루어를 미끼로 선택하셨습니다.");
				}
				
				l.setLocal1();
				
				//2(낚시시작)번을 선택하면 1번 에서 선택한 정보를 받아서 이어감
				//1번에서 2번(계곡)을 선택하고 메뉴로 돌아와 2번(낚시시작)을 선택하면 계곡에 대한 낚시게임이 시작
			}else if(s==2 && lo==2) {
				System.out.println("낚시를 시작합니다.");
				System.out.println("사용하실 낚싯대를 선택해주세요.");
				System.out.println("1.대나무 | 2.플라스틱 | 3.알루미늄 | 4.초합금");
				int dea = scan.nextInt();
				if(dea==1) {
					System.out.println("대나무 낚싯대를 선택하셨습니다.");
				}else if(dea==2) {
					System.out.println("플라스틱 낚싯대를 선택하셨습니다.");
				}else if(dea==3) {
					System.out.println("알루미늄 낚싯대를  선택하셨습니다.");
				}else if(dea==4) {
					System.out.println("초합금 낚싯대를 선택하셨습니다.");
				}
				System.out.println("사용하실 미끼를 선택해주세요.");
				System.out.println("1.점심밥 | 2.떡밥 | 3.지렁이 | 4.루어");
				int miki = scan.nextInt();
				if(miki==1) {
					System.out.println("점심밥을 미끼로 선택하셨습니다.");
				}else if(miki==2) {
					System.out.println("떡밥을 미끼로  선택하셨습니다.");
				}else if(miki==3) {
					System.out.println("지렁이를 미끼로  선택하셨습니다.");
				}else if(miki==4) {
					System.out.println("루어를 미끼로 선택하셨습니다.");
				}
				l2.setLocal2();
				
				//2(낚시시작)번을 선택하면 1번 에서 선택한 정보를 받아서 이어감
				//1번에서 3번(아마존)을 선택하고 메뉴로 돌아와 2번(낚시시작)을 선택하면 아마존에 대한 낚시게임이 시작
			}else if(s==2 && lo==3) {
				System.out.println("낚시를 시작합니다.");
				System.out.println("사용하실 낚싯대를 선택해주세요.");
				System.out.println("1.대나무 | 2.바나나 나무 | 3.아카시아 나무 | 4.야자수 나무");
				int dea = scan.nextInt();
				if(dea==1) {
					System.out.println("대나무를 낚싯대로 선택하셨습니다.");
				}else if(dea==2) {
					System.out.println("바나나 나무를 낚싯대로 선택하셨습니다.");
				}else if(dea==3) {
					System.out.println("아카시아 나무를 낚싯대로 선택하셨습니다.");
				}else if(dea==4) {
					System.out.println("야자수 나무를 낚싯대로 선택하셨습니다.");
				}
				System.out.println("사용하실 미끼를 선택해주세요.");
				System.out.println("1.점심밥 | 2.벌래 | 3.양말 | 4.팬티");
				int miki = scan.nextInt();
				if(miki==1) {
					System.out.println("점심밥을 미끼로 선택하셨습니다.");
				}else if(miki==2) {
					System.out.println("벌래을 미끼로  선택하셨습니다.");
				}else if(miki==3) {
					System.out.println("양말를 미끼로  선택하셨습니다.");
				}else if(miki==4) {
					System.out.println("팬티를 미끼로 선택하셨습니다.");
				}
				l3.setLocal3();
			}
			//3번을 선택하면 각 지역에서 잡은 물고기 리스트를 확인
			else if(s==3) {
				System.out.println("=====어항 리스트======");
				l.fishlist1();
				l2.fishlist2();
				l3.fishlist3();
			}
			//memo클래스의 dogam메소드를 불러와 실행
			else if (s==4) {
				l4.dogam();
			}
			//게임 종료
			else if(s==5) {
				System.out.println("낚시 게임을 종료합니다.감사합니다");
				System.exit(0);
				}
			}
		}
	}
