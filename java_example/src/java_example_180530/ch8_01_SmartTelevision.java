package java_example_180530;

public class ch8_01_SmartTelevision implements 
				ch8_01_RemoteControl,ch8_01_Searchable{
	private int volume;
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
		System.out.println("현재 스마트TV? 볼륨:"+volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}

	

	

	

	@Override
	public void setMete(boolean mute) {
		ch8_01_RemoteControl.super.setMete(mute);
	}
	
}
