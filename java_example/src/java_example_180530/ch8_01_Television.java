package java_example_180530;
//인터페이스 RemoteControl의 구현클래스
public class ch8_01_Television implements ch8_01_RemoteControl{
	//필드 선언
	private int volume;
	
	//인터페이스에서 선언한 turnOn 실체 메소드 선언
	//@Override 안써도 댄대용
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>ch8_01_RemoteControl.MAX_VOLUME) {
			this.volume = ch8_01_RemoteControl.MAX_VOLUME;
		}else if(volume<ch8_01_RemoteControl.MIN_VOLUME) {
			this.volume = ch8_01_RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Television 볼륨:"+volume);
	}

}
