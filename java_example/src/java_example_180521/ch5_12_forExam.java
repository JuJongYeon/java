package java_example_180521;

import java.util.Scanner;

public class ch5_12_forExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s;
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료" );
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			s = scanner.nextInt();
			int st = 0;
			int max=0;
			int[] arr = null;
			int score=0;
			if(s==1) {
				System.out.print("학생수>");
				st=scanner.nextInt();
				arr = new int[st];
			}
			else if(s==2) {
				for(int i=0;i<arr.length;i++) {
					System.out.print((i+1)+"번째 학생 점수: ");
					arr[i]=scanner.nextInt();
				}
				}
			else if(s==3) {
				System.out.println(st+"번쨰 학생 점수"+score);
			}
			else if(s==4){
				if(score > max) {
					max=score;
					}
				System.out.print("최고 점수:"+max);
				int sum= 0;
				sum+=score;
				double avg=100*((double)sum/arr.length);
				System.out.println("평균 점수:"+avg);
			}
			else if(s==5){
				System.out.println("종료");break;
				}
			}
		}
	}

