package java_example_180531_3;

public class CountableExample {
	public static void main(String[] args) {
		Countable[] m = {new Bird("뻐꾸기",2),new Bird("독수리",2)
				,new Tree("사과나무",5),new Tree("밤나무",5)};
		
		for(Countable e: m) {
			
			e.count();}
		
		for(int i=0;i<m.length;i++) {
			
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly();
			}else if(m[i] instanceof Tree) {
				((Tree)m[i]).ripen();
			}
		}
	}
}
