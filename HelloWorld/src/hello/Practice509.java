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
				System.out.println("학생수");
				studentNum = scanner.nextInt();
			}else if(selectNo == 21) {
				for (int i = 0; i < studentNum; i++) {
					scores[i] = scanner.nextInt();
					System.out.println(scores[i]);

				}
			}
		}

	}
}
