package java_example_180531;

public class ch8_03_ImplementationC implements ch8_03_InterFaceC{

	@Override
	public void mathodA() {
		//InterfaceA의 메소드
		System.out.println("ch8_03_InterFaceC-mathodA() 실행");
	}

	@Override
	public void methodB() {
		//InterfaceB의 메소드
				System.out.println("ch8_03_InterFaceC-mathodB() 실행");
		
	}

	@Override
	public void methodC() {
		//InterfaceC의 메소드
				System.out.println("ch8_03_InterFaceC-mathodC() 실행");
		
	}

}
