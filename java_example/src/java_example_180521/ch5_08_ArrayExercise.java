package java_example_180521;
/*
 * 2차원 배열을 사용하여 평점 계산하기
 */
public class ch5_08_ArrayExercise {

	public static void main(String[] args) {
		double score[][]= {{3.3,3.4},
						   {3.5,3.8},
		                   {4.2,4.3},
		                   {3.9,4.0}};
		double sum=0;
		double avg=0;
		//score.length : score 배열의 행의 길이=4
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
			System.out.print(score[i][j]);
			sum=sum+score[i][j];
			avg=sum/score.length/2;
			}
		}
		System.out.println("합="+sum);
		System.out.println("평균="+avg);
	}
}
