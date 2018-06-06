package java_example_180604;
//쇼핑몰을 실행하기 위한 메인 클래스
public class ShopLaunchar {

	public static void main(String[] args) {
		IShop shop = new Myshop();
		//인터페이스를 구현하는 클래스?
		shop.setTitle("Myshop");
		shop.genUser();
		shop.genProduck();
		shop.strat();
	}

}
