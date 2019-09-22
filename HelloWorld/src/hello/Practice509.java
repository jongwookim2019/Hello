package hello;

import java.util.Scanner;

public class Practice509 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수: ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[ " + i + " ]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				double avg = 0.0;
				int Max = 0, sum =0;
				for (int i = 0; i < scores.length; i++) {				
					Max = (Max > scores[i]? Max : scores[i]);
						sum += scores[i];
					
				}
				avg =(double) sum / scores.length;
				System.out.println("최대점수는 : "+Max);
				System.out.println("평균점수는 : " + avg);

			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}
