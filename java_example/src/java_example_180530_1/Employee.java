package java_example_180530_1;

public class Employee {
	public String name;
	public double sal;
	
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	double salUp(double salUp) {
		double salu = this.sal*1.1;
		return salu;
	}
	
}
