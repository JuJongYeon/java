package java_example_180524;

public class ch6_20_Exercise {
	private String name;
	private int assScore;
	private int examScore;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssScore() {
		return assScore;
	}
	public void setAssScore(int assScore) {
		this.assScore = assScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
		/*if(examScore>=90) {
			System.out.println("학점A");
		}else if(examScore>=80 && examScore<90) {
			System.out.println("학점B");
	}*/
		
		}
	void result() {
		System.out.println("이름:"+name);
		System.out.println("과제 점수:"+assScore);
		System.out.println("시험점수:"+examScore);
		if(examScore>=90) {
			System.out.println("학점A");
		}else if(examScore>=80 && examScore<90) {
			System.out.println("학점B");
	}
	}
}
