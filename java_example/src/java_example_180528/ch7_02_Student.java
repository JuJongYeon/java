package java_example_180528;

public class ch7_02_Student extends ch7_02_People{
	//필드 생성
	public int studentNo;
	
	//생성자 선언
	public ch7_02_Student(String name,String ssn, int studentNo){
		/*this.name=name;
		this.ssn=ssn;*/
		
		super(name,ssn);//부모클래스의 해당 매개변수를 이용하는 생서자를 바로 호출
		this.studentNo=studentNo;
	}
}
