package Practice0923;

import java.util.Scanner;

public class AccountBook {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int[][] Ac = new int[10][6];
		int balance = 0, result = 0, income = 0, expense = 0, result2 = 0;
		int[] list = new int[Ac.length];
		int a = 0;
		int c = 0;

		while (run) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println(" 1.목록 | 2.입금 | 3.출금 | 4.입출금 | 5.결산 | 6.잔고 | 7.목록별 보기 | 8.월말 결산 | 9.종료 ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("선택 > ");

			int num;
			num = sc.nextInt();

			if (num == 1) {
				System.out.print(" 목록 > ");
				list[a] = sc.nextInt();
				Ac[a][0] = list[a];
				a++;

			} else if (num == 2) {
				System.out.print(" 입금액 > ");
				income = sc.nextInt();
				Ac[a][1] = income;
				balance += income;

			} else if (num == 3) {
				System.out.print(" 출금액 > ");
				expense = sc.nextInt();
				Ac[a][2] = expense;
				balance -= expense;

			} else if (num == 4) {
				System.out.print(" 입금액 > ");
				income = sc.nextInt();
				balance += income;
				System.out.print(" 출금액 > ");
				expense = sc.nextInt();
				balance -= expense;
				result = income - expense;
				Ac[a][3] = result;
				System.out.println(" 입출금액 > " + result + " 잔액 > " + balance);

			} else if (num == 5) {
				result2 = (Ac[a][1] - Ac[a][2]) + Ac[a][3];
				Ac[a][4] = result2;
				System.out.println(" 결산액 > " + result2 + " 잔액 > " + balance);

			} else if (num == 6) {
				Ac[a][5] = balance;
				System.out.print(" 잔고 > " + balance);
				System.out.println();

			} else if (num == 7) {
				System.out.print(" 목록 번호 > ");
				c = sc.nextInt();
				System.out.print(
						" 입금액 > " + Ac[c][1] + " 출금액 > " + Ac[c][2] + " 결산액 > " + Ac[c][4] + " 잔액 > " + Ac[c][5]);
				System.out.println();

			} else if (num == 8) {
				for (int k = 0; k < Ac.length; k++) {
					for (int l = 0; l < Ac[k].length; l++) {
						System.out.printf("%4d", Ac[k][l]);
						if (l == 5) {
							System.out.println();
						}
					}
				}

			} else if (num == 9) {
				run = false;

				System.out.println("프로그램 종료");
			}
		}
	}
}
