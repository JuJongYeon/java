package java_example_180531;

public class ch8_03_Example {
	public static void main(String []args) {
		
	
	ch8_03_ImplementationC impl = new ch8_03_ImplementationC();
	
	ch8_03_InterFaceA ia = impl;
	ia.mathodA();
	ch8_03_InterFaceB ib = impl;
	ib.methodB();
	ch8_03_InterFaceC ic = impl;
	ia.mathodA();
	ib.methodB();
	ic.methodC();
	}
}
