package java_example_180518;

public class ch5_03_ArrayInArrayExample {

	public static void main(String[] args) {
		//2차원 배열 선언, 배열의 크기 2행3열 행이 가로 열이 세로 
		int[][] mathScores = new int[2][3];
		for(int i=0;i<mathScores.length;i++) {				//행의 길이
			for(int k=0;k<mathScores[i].length;k++) {		//[i]행이 가지는 크기(열)
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];//1행의 2개의 열 배열
		englishScores[1] = new int[3];//2행의 3개의 열 배열
		for(int i=0;i<englishScores.length;i++) {
			for(int k=0;k<englishScores[i].length;k++) {
				System.out.println("englishScores["+i+"]["+k+"]="
						+englishScores[i][k]);
			}
		}
		
		int[][] javaScores = {{95,80},{92,96,80}};
		for(int i=0;i<javaScores.length;i++) {
			for(int k=0;k<javaScores[i].length;k++) {
				System.out.println("javaScores["+i+"]["+k+" ]="
						+javaScores[i][k]);
			}
		}
		
	}

}
