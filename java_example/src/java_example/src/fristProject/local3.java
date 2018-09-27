package fristProject;

import java.util.Scanner;

public class local3 extends fishing{
		
	Scanner scan = new Scanner(System.in);
	//물고기 이름을 사용하기위해 fishing 클래스 객체 선언
	fishing fh = new fishing();
	//잡은 물고기를 담기위한 배열선언
	String [] get = new String[100];
	//각 local별 이름을 지정
	String loc = "아마존";
	//낚시를 해서 낚은 물고기를 저장하기 위한 변수
	String getfishi;
	//낚은 물고기를 배열에 저장했을떄 마다 하나씩 카운트 해주는 변수
	int size =0;
	
	//세번째 지역에 대한 메소드 선언
	public void setLocal3() //아마존
	{int n = (int)(Math.random()*50)+1;//낚시질을 위한 랜덤변수 1~50
	int sum = 0;//낚시질 횟수를 카운트해서 담아주는 변수 선언
	System.out.println("입력횟수"+n);
	for(int i=0;i<n;i++) {
		System.out.println("      /\\");
		System.out.println("  )  ( ')");
		System.out.println(" (  /  )");
		System.out.println(" \\(__)|____________.");
		System.out.println("                    :");
		System.out.println("                    ;");
		System.out.print("              ~~~~~~~~~~~~~~~~~~~~");	
	/*String*/int  space = scan.nextInt();
	/*Integer.parseInt(space);*/
	//space 입력 마다 sum에 카운트
	sum++;
	if(sum == n) {
	if(n>=41 && n<=50) {
		int cm = (int)(Math.random()*500)+100;//낚은 악어의 크기에 대한 랜덤변수 100~500
		//n이 41에서50사이일경우 악어를 낚을 수 있음
		fh.setName("악어");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다");
		System.out.println("                    eee");
		System.out.println("                   ee  eG   ,e");
		System.out.println("             D zeeeXK 5eeeeeezee");
		System.out.println("           W eeXy55KEeGGeDe5eDe");
		System.out.println("           eEeD5XzDKeX       K");
		System.out.println("         eEeX,WE#KKue9");
		System.out.println("       eye5,ye#uKGGKeD");
		System.out.println("     e e5KKe#KXe9uuW#eG#eDe5eue");
		System.out.println("   eeeu# eXW,,   GGKu y  5 # Gye");
		System.out.println("    eGeeEeeeeGeeeeeeeEeeeeeeeee");
	}else if (n == 40) {
		//n이 40일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=31 && n<=39) {
		int cm = (int)(Math.random()*100)+10;//낚은 피라루쿠의 크기에 대한 랜덤변수 10~100
		//n이 31에서39사이일경우 피라루쿠를 낚을 수 있음
		fh.setName("피라루쿠");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다.");
		System.out.println(">゜)))彡 ");
	}else if(n == 30) {
		//n이 30일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=21 && n<=29) {
		int cm = (int)(Math.random()*100)+10;//낚은 피라냐의 크기에 대한 랜덤변수 10~100
		//n이 21에서29사이일경우 피라냐를 낚을 수 있음
		fh.setName("피라냐");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다.");
		System.out.println("゜~>゜))>< ");
	}else if(n == 20) {
		//n이 20일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=11 && n<=19) {
		int cm = (int)(Math.random()*100)+10;//낚은 파쿠의 크기에 대한 랜덤변수 10~100
		//n이 11에서19사이일경우 파쿠를 낚을 수 있음
		fh.setName("파쿠");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다.");
		System.out.println(">゜)))>< ");
	}else if(n == 10) {
		//n이 10일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=2 && n<=9) {
		int cm = (int)(Math.random()*50)+15;//낚은 송사리의 크기에 대한 랜덤변수 15~50
		//n이 2에서9사이일경우 송사리를 낚을 수 있음
		fh.setName("송사리");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다");
		System.out.println("ᗦ↞◃");
	}else if(n == 1) {
		//n이 1일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}
		 }
	 }
	System.out.println("어항에 담으시겠습니까?");
	String s = scan.next();
	
	//case문을 사용하여 리스트에 담을지 말지 선택 
	//"예"를 입력하면 리스트에 순차적으로 저장
	//"아니오"를 입력하면 돌려보내고 처음으로 감
	
	switch(s) {
	case "예":
		//for문에 나온 잡은 물고기를 getfishi에 저장
		getfishi = fh.getName();
		//배열의 값이 널일경우 잡은 물고기를 배열에 저장하고 size를 1씩 증가
		for(int i=0;i<get.length;i++) {
			if(get[i] == null) {
				get[i]=getfishi;
				size++;
				break;
			}
		}
		 break;
	case "아니오":
		System.out.println("돌려보냈습니다.");
		break;
	default :
		setLocal3();
	}
	}
	
	//물고기 리스트 메소드
	public void fishlist3() {
		for(int m=0; m<size; m++) {
				System.out.println(loc+" 지역에서 잡은 물고기:"+get[m]);
		}
	}
}
