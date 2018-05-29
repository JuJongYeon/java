package java_example_180524;

import java_example_180524.ch6_17_A;

public class ch6_17_C {
	public ch6_17_C()
	{
	ch6_17_A a1 = new ch6_17_A();
	a1.field1=1;
	a1.field2=1;
	//a1.field3=1; private 이라 다른 클래스에선 못뽑아옴
	
	a1.method1();
	a1.method2();
	//a1.method3(); private 이라 다른 클래스에선 못뽑아옴
	
	} 
}
