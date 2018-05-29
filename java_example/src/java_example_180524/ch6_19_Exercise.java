package java_example_180524;

public class ch6_19_Exercise {
	String name;
	int assScore;
	int examScore;
	/*int ch6_19_Exercise(String name,int assScore,int assScore){
		this.name=name; 선남
		this.assScore=assScore; 91
		this.examScore=examScore; 85
		}*/
	
	void result() {
		System.out.println("이름:"+name);
		System.out.println("과제점수:"+assScore);
		System.out.println("시험점수:"+examScore);
		if(examScore>=90) {
			System.out.println("학점A");
		}else if(examScore>=80 && examScore<90) {
			System.out.println("학점B");
		}
	}
	/*void result1() {
		System.out.println("이름:"+name);
		System.out.println("과제점수:"+assScore);
		System.out.println("시험점수:"+examScore);
		System.out.println("학점:"+getGrade());}
	
	public String getGrade() {
		String grade = null;
		double avg;
		avg=examScore;
		if(examScore>=90) {
			System.out.println("학점A");
		}else if(examScore>=80 && examScore<90) {
			System.out.println("학점B");
		}
		return grade;
	}*/
	
}
