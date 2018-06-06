package java_example_180604;
//Ishop 인터페이스의 구현 클래스

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Myshop implements IShop{
	
	//회원 정보 득록을 위한 배열 선언
	User[] user = new User[2];
	
	//상품정보등록을 위한 배열 선언
	Produck [] produck = new Produck[4];
	
	//상품추가를 위한 장바구니
	ArrayList <Produck>cart = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	
	String title;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		User users = new User("사용자1", PayType.CARD);
		user[0] = users;
		users = new User("사용자2", PayType.CASH);
		user[1] = users;
	}

	@Override
	public void genProduck() {
		CellPhone cp = new CellPhone("갤럭시 S9",1000000,"skt");
		produck[0]=cp;
		cp = new CellPhone("애플 아이폰X",100000,"kt");
		produck[1]=cp;
		SmartTV st= new SmartTV("삼성 3D Smart TV",5000000,"4K");
		produck[2]=st;
		st = new SmartTV("LG 3D Smart TV",4000000,"UHD");
		produck[3]=st;
		
	}

	@Override
	public void strat() {
		int i=0;
		System.out.println("MYshop : 메인화면 - 계정선택");
		System.out.println("================================");
		for(User u : user) {
			System.out.println("["+(i++)+"]"+u.getName()+u.getPayType());
			
			}
		System.out.println("[x]"+"종료");
		System.out.print("선택 : ");
		String s = scan.next();
		System.out.println("## "+s+"선택 ##");
		
		switch (s) {
		case "x" : System.exit(0);
					break;
		default :
			selUser = Integer.parseInt(s);
			produckList();
		}
	}

	private void produckList() {
		System.out.println("MyShop : 상품 목록  - 상품 선택");
		System.out.println("===========================");
		int i = 0;
		for(Produck c : produck) {
			System.out.println("["+i+"]");
			c.printDetail();
			i++;
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		String s = scan.next();
		System.out.println("## "+s+"선택 ##");
		
		switch (s) {
		case "h" : strat();
					break;
					
		case "c" : checkOut();
					break;
		default :
			int psel = Integer.parseInt(s);
			cart.add(produck[psel]);
			produckList();
		}
	}
	public void checkOut() {
		System.out.println(title + ": 체크아웃");
		System.out.println("===================");
		int total=0;
		int i=0;
		
		for(Produck p : cart) {
			System.out.println("["+i+"]"+p.pName+p.price);
			total = total +p.price;
			i++;
		}
		System.out.println("=====================");
		
		System.out.println("결제 방법 :"+user[selUser].getPayType());
		
		System.out.println("합계 :"+total+"원 입니다.");
		System.out.println("[p]이전,[q]결제완료");
		System.out.println("선택 :");
		String s = scan.next();
		
		switch(s) {
		case "p":
			produckList();
			break;
		case "q":
			System.out.println("##결제가 완료되었습니다. 종료합니다");
			System.exit(0);
			break;
		default:
			checkOut();
		}
		
	}
}
