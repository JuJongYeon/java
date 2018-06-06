package java_example_180604;

public class CellPhone extends Produck{
	String carrier;
	
	public CellPhone(String pName,int price, String carrier) {
		this.pName=pName;
		this.price=price;
		this.carrier=carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 : "+carrier);
		
	}
	
	
}
