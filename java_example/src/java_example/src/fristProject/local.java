package fristProject;

import java.util.Scanner;

public class local extends fishing{
	
	Scanner scan = new Scanner(System.in);
	//물고기 이름을 사용하기위해 fishing 클래스 객체 선언
	fishing fh = new fishing();
	//잡은 물고기를 담기위한 배열선언
	String [] get = new String[100];
	//각 local별 이름을 지정
	String loc = "서해안";
	//낚시를 해서 낚은 물고기를 저장하기 위한 변수
	String getfishi;
	//낚은 물고기를 배열에 저장했을떄 마다 하나씩 카운트 해주는 변수
	int size =0;
	
	//첫번째 지역에 대한 메소드 선언
	public void setLocal1() //서해안
	{int n = (int)(Math.random()*50)+1;//낚시질을 위한 랜덤변수 1~50
	int sum = 0;//낚시질 횟수를 카운트해서 담아주는 변수 선언
	System.out.println("입력횟수:"+n);
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
	if(sum == n)
	//n과 sum을 같게 하여 물고기를 포획
	{if(n>=41 && n<=50) {
		int cm = (int)(Math.random()*200)+5;//낚은 고래의 크기에 대한 랜덤변수 15~200
		//n이 41에서50사이일경우 고래를 낚을 수 있음
		fh.setName("고래");
		System.out.println(cm+"m의 "+fh.getName()+"를 잡았습니다.");
		System.out.println(". ><(((o ______)");
	}else if (n == 40) {
		//n이 40일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=31 && n<=39) {
		int cm = (int)(Math.random()*500)+100;//낚은 참치의 크기에 대한 랜덤변수 100~500
		//n이 31에서39사이일경우 참치를 낚을 수 있음
		fh.setName("참치");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다.");
		System.out.println(">゜))))彡 ");
	}else if(n == 30) {
		//n이 30일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=21 && n<=29) {
		int cm = (int)(Math.random()*250)+30;//낚은 참돔의 크기에 대한 랜덤변수 30~250
		//n이 21에서29사이일경우 참돔를 낚을 수 있음
		fh.setName("참돔");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다");
		System.out.println(">ﾟ)##)彡");
	}else if(n == 20) {
		//n이 20일 경우 놓치고 처음으로 돌아감
		System.out.println("놓쳤습니다....ↀᴥↀ՞ ");
		return;
	}else if(n>=11 && n<=19) {
		int cm = (int)(Math.random()*100)+10;//낚은 해파리의 크기에 대한 랜덤변수 10~100
		//n이 11에서19사이일경우 해파리를 낚을 수 있음
		fh.setName("해파리");
		System.out.println(cm+"cm의 "+fh.getName()+"를 잡았습니다");
		System.out.println("（：。）ミ");
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
		setLocal1();
	}
	}
	
	//물고기 리스트 메소드
	public void fishlist1() {
		for(int m=0; m<size; m++) {
				System.out.println(loc+" 지역에서 잡은 물고기:"+get[m]);
		}
	}
}
