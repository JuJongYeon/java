package java_example_180530_1;

public class Manager extends Employee{
	Manager(String name, double sal,int B) {
		super(name, sal);
		this.B=B;
	}

	public int B;
	
	double salUp(double sal) {
		sal = this.sal*1.3;
		sal+=B;
		return sal;
	}
}
