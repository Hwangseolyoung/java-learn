package Chap05.book.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
//		int[] scores = null;
		int[] scores = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum += scanner.nextInt();
				
			} else if (selectNo == 2) {
				System.out.print("scores[0] > ");
				scores[0] = scanner.nextInt();
				System.out.print("scores[1] > ");
				scores[1] = scanner.nextInt();
				System.out.print("scores[2] > ");
				scores[2] = scanner.nextInt();
				
			} else if (selectNo == 3) {
				System.out.println("scores[0] : " + scores[0]);
				System.out.println("scores[1] : " + scores[1]);
				System.out.println("scores[2] : " + scores[2]);
				
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
				}
				
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
						
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
			
		}
		
		
		System.out.println("프로그램 종료");
	}

}
