package java_example_180525;

public class ch6_26_Account {
	//필드선언
	private String ano;
	private String name;
	private int balance;
	
	//생성자 선언
	//
	public ch6_26_Account(String ano,String name, int balance) {
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}
	//setter 필드값을 설정하고자 할때
	//getter 필드값을 내보낼때?보여줄때?

	public String getAno() {return ano;}
	
	public void setAno(String ano) {this.ano = ano;}
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public int getBalance() {return balance;}
	
	public void setBalance(int balance) {this.balance = balance;}
	
	
}
