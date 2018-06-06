package java_example_180530_1;

public class EmployExample {

	public static void main(String[] args) {
		
		Employee e = new Employee("박기식",100);
		Manager m = new Manager("김명동",100,10);
		Executive E = new Executive("고광채",100,100,100);
		
		System.out.println("사원이름은 "+e.name+" 이고 "+" 급여는 "+(int)+e.salUp(100)+"만원 입니다.");
		System.out.println("메니저이름은 "+m.name+" 이고 "+" 급여는 "+(int)m.salUp(100)+"만원이고 보너스는 "+m.B+"만원 입니다.");
		System.out.println("임원이름은 "+E.name+" 이고 "+" 급여는 "+(int)E.salUp(500)+"만원이고 보너스는 "+E.B
							+"만원 이고 "+" 회사주식지분으로 "+E.stoc+"만원 을 받았습니다.");
		
	}
}
