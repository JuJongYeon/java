package java_example_180516;

public class ch3_3_DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean play = true;
		System.out.println(play);//play=true
		
		//자바에서 !의 의미는 NOT을 의미함
		play = !play;//play의 반대값을 play에 대입
		System.out.println(play);//play=false
		
		play = !play;//play의 반대값을 play에 대입
		System.out.println(play);//play=true

	}

}
