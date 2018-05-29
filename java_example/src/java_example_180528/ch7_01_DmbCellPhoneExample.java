package java_example_180528;

public class ch7_01_DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone에 대한 객체 생성
		ch7_01_DmbCellPhone p = new ch7_01_DmbCellPhone("삼성","검은색",7);
		p.turnOnDmb();
		p.turnOffDmb();
		p.changeChannelDmb(8);
		
		//생성한 객체의 model,color,channel 값을 각각 출력
		//model,color 필드는 부모의 필드지만 상속받았기 때문에 호출간으
		System.out.println(p.model);
		System.out.println(p.channel);
		System.out.println(p.color);
		
		//부모 클래스에서 선언한 메소드 각각 호출
		ch7_01_CellPhone m = new ch7_01_CellPhone();
		m.PowerOn();
		m.PowerOff();
		m.hangUp();
		m.bell();
		m.sendVoice("????????");
		m.receiveVoice("!!!!!!!!!!!!");
		
		//자식 클래스에서 선언한 메소드 각각 호출
		ch7_01_DmbCellPhone p2 = new ch7_01_DmbCellPhone("아이폰", "흰색", 50);
		System.out.println(p2.model);
		System.out.println(p2.color);
		System.out.println(p2.channel);
		p2.turnOnDmb();
		p2.turnOffDmb();
		p2.changeChannelDmb(99);
	}
}
