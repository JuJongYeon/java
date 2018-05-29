package java_example_180521;

import java.util.Scanner;

public class ch5_13_cExam {

	public static void main(String[] args) {
		boolean run = true;
		int st = 0;//학생수를 받아 처리하기 위한 변수
		int[] score=null;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료" );
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			int s = scanner.nextInt();
			
			if(s==1) {
				//학생수를 입력받아 입력받은 값만큼의 배열크기로 설정
				System.out.print("학생수>");
				st=scanner.nextInt();
				//score배열변수의 크기를 3으로 설정
				//score=new int[3];
				//score 배열 변수의 크기를 입력받으 만큼으로 설정
				score=new int[st];
			}
			else if(s==2) {
				//입력된 학생 수 만큼의 점수를 입력하여 배열에 저장
				for(int i=0;i<score.length;i++) {
					System.out.print((i+1)+"번째 학생 점수: ");
					score[i]=scanner.nextInt();
				}
			}
			else if(s==3) {
				//배열에 입력된 값을 하나하나 출력
				for(int i=0;i<score.length;i++) {
					System.out.println((i+1)+"번째 학생 점수:"+score[i]);
				}
			}
			else if(s==4) {
				//배열에 입력된 값 중 최고값과 평균값을 계산하여 출력
				int max=0,sum=0;
				double avg = 0;
				for(int i=0;i<score.length;i++) {
					max = (max<score[i])?score[i]:max;
					sum = sum+score[i];
				}
				avg=(double)sum/score.length;
				System.out.println("최고 점수:"+max);
				System.out.println("평균 점수:"+avg);
			}
			else if(s==5) {
				//반복문 종료
				run=false;
				System.out.println("종료");
			}
		}
	}

}
