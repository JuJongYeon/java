package java_example_180529;

public class ch7_10_Sedan extends ch7_10_Car{
	
	public int suck;
	
	public ch7_10_Sedan(String color, int speed,int suck) {
		super(color, speed);
		this.suck=suck;
	}	
	
	int ja(int suck) {
		//System.out.println("좌석수는"+suck+"개 입니다.");
		return suck;
	}
	
	
}
