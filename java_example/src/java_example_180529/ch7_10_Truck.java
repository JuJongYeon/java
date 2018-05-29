package java_example_180529;

public class ch7_10_Truck extends ch7_10_Car{
	public int juck;
	
		public ch7_10_Truck(String color,int speed,int juck){
		super(color,speed);
		this.juck=juck;
	}
		int jea (int juck) {
			//System.out.println("적재량은 "+juck+"톤 입니다.");
			return juck;
		}
}
