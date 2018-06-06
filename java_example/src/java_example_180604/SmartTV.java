package java_example_180604;

public class SmartTV extends Produck{
	String resolution;
	
	public SmartTV(String pName,int price, String resolution) {
		this.pName=pName;
		this.price=price;
		this.resolution=resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 : "+resolution);
		
	}
}
