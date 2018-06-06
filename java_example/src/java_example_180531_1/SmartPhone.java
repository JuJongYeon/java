package java_example_180531_1;

public class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	
	@Override
	public void makeCall() {
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void takeCall() {
		System.out.println("전화를 겁니다.");

	}

	@Override
	public void musicStart() {
		System.out.println("읍악을 틉니다.");

	}

	@Override
	public void musicStop() {
		System.out.println("음악을 끕니다.");

	}

	@Override
	public void takeSns() {
		System.out.println("문자를 받습니다..");

	}

	@Override
	public void makeSns() {
		System.out.println("문자를 보냅니다.");

	
	}
}

