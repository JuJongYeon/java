package java_example_180529;

public class ch7_09_Tire {
public int maxRotaion;
public int accmulatedRotaion ;
public String location;

public ch7_09_Tire(String location, int maxRotaion) {
	this.location=location;
	this.maxRotaion=maxRotaion;
}
public boolean roll() {
	//ch7_09_Tire forntlefttire = new ch7_09_Tire("앞왼쪽",6);
	//ch7_09_Tire forntrighttire = new ch7_09_Tire("앞오른쪽",2);
	//ch7_09_Tire backlefttire = new ch7_09_Tire("뒤왼쪽",3);
	//ch7_09_Tire backrighttire = new ch7_09_Tire("뒤오른쪽",4);
	
	//메소드
	//accmulatedRotaion = 0(초기값)
	++accmulatedRotaion;//1
	//accmulatedRotaion =1,maxRotaion=6
	//accmulatedRotaion =1,maxRotaion=2
	//accmulatedRotaion =1,maxRotaion=3
	//accmulatedRotaion =1,maxRotaion=4

	if(accmulatedRotaion<maxRotaion) {
		System.out.println(location+"Tire 수명:"+(maxRotaion-accmulatedRotaion)+"회");
		return true;
	}else {
		System.out.println("***"+location+"Tire 펑크***");
		return false;
		}
	}
}
