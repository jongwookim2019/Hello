package hello;

import java.util.Scanner;

public class AccountBook {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[][] Ac = new int[10][5];
		int balance = 0, result = 0, income = 0, expense = 0;
		int[] list = new int[Ac.length];

		while (run) {
			System.out.println("------------------------------");
			System.out.println(" 1.목록 | 2.예금 | 3.출금 | 4.잔고 | 5.종료 ");
			System.out.println("------------------------------");
			System.out.println("선택 > ");

			int num;
			num = sc.nextInt();
			
			if (num == 1) {
			System.out.print("목록 > ");
			int a = 1;
			list[a] = sc.nextInt();
			Ac[a] = list[a];
			a++;
			
			} else if (num == 2) {
				System.out.print("예금액 > ");
				income = sc.nextInt();
				
			} else if (num == 3) {
				System.out.print("출금액 > ");
				income = sc.nextInt();
			
			} else if (num == 4) {
				System.out.print("잔고 > " + balance);

			} else if (num == 5) {
				run = false;

				System.out.println("프로그램 종료");
			}
		}
	}
}
