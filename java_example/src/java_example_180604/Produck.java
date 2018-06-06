package java_example_180604;
//상품 정의를 위한 추상클래스
public /*추상클래스*/abstract class Produck {
	//필드 선언
	String pName;  //상품이름
	int price;		//상품가격
	
	//상품의 구제적 정보 출력을 위한 메소드
	public void printDetail() {
		System.out.println("상품명 : "+pName+",");
		System.out.println("상품가격 : "+price+",");
		printExtra();
	}
	
	//상품명, 가격정보 이외의 추가정보 출력을 위한 메소드
	public abstract void printExtra();
	
}
