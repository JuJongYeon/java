package fristProject;

import java.util.Scanner;

public class local extends fishing{
	String local;
		
	Scanner scan = new Scanner(System.in);
	fishing fh = new fishing();
	int sum = 0;
	
	public void setLocal1() //서해안
	{
	for(int i=0;i<fh.n;i++) {
	System.out.println("난수="+fh.n);
	System.out.println("낚싯줄을 땡기세요");
	String space = scan.nextLine();
	Integer.parseInt(space);
	sum++;
	if(sum == fh.n) {
	if(fh.n>=41 && fh.n<=50) {
		fh.setName("상어");
		System.out.println(fh.getName()+"를 잡았습니다");
	}else if (fh.n == 40) {
		System.out.println("놓쳤습니다.");
		return;
	}else if(fh.n>=31 && fh.n<=39) {
		fh.setName("참치 ");
		System.out.println(fh.getName()+"잡음");
	}else if(fh.n == 30) {
		System.out.println("놓쳤습니다.");
		return;
	}else if(fh.n>=21 && fh.n<=29) {
		fh.setName("참돔 ");
		System.out.println(fh.getName()+"를 잡았습니다");
	}else if(fh.n == 20) {
		System.out.println("놓쳤습니다.");
		return;
	}else if(fh.n>=11 && fh.n<=19) {
		fh.setName("우럭 ");
		System.out.println(fh.getName()+"를 잡았습니다");
	}else if(fh.n == 10) {
		System.out.println("놓쳤습니다.다시 하세요");
		return;
	}else if(fh.n>=2 && fh.n<=9) {
		fh.setName("송사리");
		System.out.println(fh.getName()+"를 잡았습니다");
	}else if(fh.n == 1) {
		System.out.println("놓쳤습니다.");
		return;
	}
	System.out.println("어항에 담으시겠습니까?");
	String s = scan.next();
	switch(s) {
	case "예":
		break;
	case "아니오":
		System.out.println("돌려보냈습니다.");
		break;
	default :
		setLocal1();
	}
	}
	}
	}
	
	
	public void setLocal2() //계곡
	{for(int i=0;i<fh.n;i++) {
		System.out.println("난수="+fh.n);
		System.out.println("낚싯줄을 땡기세요");
		String space = scan.nextLine();
		Integer.parseInt(space);
		sum++;
		if(sum == fh.n) {
		if(fh.n>=41 && fh.n<=50) {
			fh.setName("금강모치 ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if (fh.n == 40) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=31 && fh.n<=39) {
			fh.setName("꺽지 ");
			System.out.println(fh.getName()+"잡음");
		}else if(fh.n == 30) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=21 && fh.n<=29) {
			fh.setName("쏘가리  ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if(fh.n == 20) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=11 && fh.n<=19) {
			fh.setName("가재 ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if(fh.n == 10) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=2 && fh.n<=9) {
			fh.setName("송사리 ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if(fh.n == 1) {
			System.out.println("놓쳤습니다.");
			return;
		}
		System.out.println("어항에 담으시겠습니까?");
		String s = scan.next();
		switch(s) {
		case "예":
			System.out.println("어항에 담았습니다.");
			break;
		case "아니오":
			System.out.println("돌려보냈습니다.");
			break;
		default :
			setLocal1();
		}
		}
		}}
	public void setLocal3() //아마존
	{for(int i=0;i<fh.n;i++) {
		System.out.println("난수="+fh.n);
		System.out.println("낚싯줄을 땡기세요");
		String space = scan.nextLine();
		Integer.parseInt(space);
		sum++;
		if(sum == fh.n) {
		if(fh.n>=41 && fh.n<=50) {
			fh.setName("악어 ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if (fh.n == 40) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=31 && fh.n<=39) {
			fh.setName("피라루쿠 ");
			System.out.println(fh.getName()+"잡음");
		}else if(fh.n == 30) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=21 && fh.n<=29) {
			fh.setName("피라냐  ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if(fh.n == 20) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=11 && fh.n<=19) {
			fh.setName("파쿠 ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if(fh.n == 10) {
			System.out.println("놓쳤습니다.");
			return;
		}else if(fh.n>=2 && fh.n<=9) {
			fh.setName("송사리 ");
			System.out.println(fh.getName()+"를 잡았습니다");
		}else if(fh.n == 1) {
			System.out.println("놓쳤습니다.");
			return;
		}
		System.out.println("어항에 담으시겠습니까?");
		String s = scan.next();
		switch(s) {
		case "예":
			System.out.println("어항에 담았습니다.");
			break;
		case "아니오":
			System.out.println("돌려보냈습니다.");
			break;
		default :
			setLocal1();
		}
		}
		}}
	
}
