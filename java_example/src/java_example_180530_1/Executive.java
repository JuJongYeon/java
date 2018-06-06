package java_example_180530_1;

public class Executive extends Manager{
	Executive(String name, double sal, int B,int stoc) {
		super(name, sal, B);
		this.stoc=stoc;
	}
	public int stoc;
	
	double salUp(double sal) {
		sal = sal+(sal*0.3);
		sal+=B;
		sal+=stoc;
		return sal;
	}
}
