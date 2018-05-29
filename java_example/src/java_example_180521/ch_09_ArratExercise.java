package java_example_180521;

import java.util.Scanner;

/*
 * 단어맞추기 게임
 */
public class ch_09_ArratExercise {

	public static void main(String[] args) {
		String[][] words= {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"monitor","모니터"},
				{"mouse","마우스"}};
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum=0;
		for(int i=0;i<words.length;i++) {
			count++;
			System.out.println("문제"+count+"."+words[i][0]+"의 뜻은 무엇인가요?");
			System.out.println("단어를 입력하세요:");
			String m;
			m = scan.next();
			System.out.println(m);
			System.out.println(words[i][0]);
			if((words[i][1]).equals(m)) {
				System.out.println("정답입니다.");
				sum++;
				} else{
				System.out.println("틀렸습니다.");
				System.out.println("정답은"+words[i][0]+"입니다.");
			}
			}
		System.out.println("총"+sum+"개를 맞췄습니다.");
		double avg=100*((double)sum/words.length);
		System.out.println("정답률은"+avg+"%입니다.");
		}
	}

