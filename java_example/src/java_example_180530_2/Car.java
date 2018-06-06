package java_example_180530_2;

public abstract class Car {
	public int speed;
	public String color;
	
	Car(int speed,String color){
		this.color=color;
		this.speed=speed;
	}
	
	public abstract void trunk();
}
