package Paactice0926;

import java.util.Scanner;

public class Baseball {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = (int) (Math.random() * 8) + 1;
		int b = (int) (Math.random() * 8) + 1;
		int c = (int) (Math.random() * 8) + 1;
		int[] base = new int[3];
		for (int i=0; i<base.length; i++) {
			base[i] = a; // 수정중
			
		}
		if (a != 0) {
			base[0] = a;
		} else if (a != b) {
			base[1] = b;
		} else if (c != b) {
			base[2] = c;

		}
		System.out.println(base[0] + "," + base[1] + "," + base[2]);
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int[] print = new int[3];
		System.out.println("값 3개를 입력하세요");
		p1 = sc.nextInt();
		print[0] = p1;
		p2 = sc.nextInt();
		print[1] = p2;
		p3 = sc.nextInt();
		print[2] = p3;
		System.out.println(print[0] + "," + print[1] + "," + print[2]);
		int strike = 0, ball = 0;
		for (int i = 0; i < base.length; i++) {
			for (int j = 0; j < print.length; j++) {
				if (base[i] == print[j]) {
					if (i == j) {
						strike++;
					} else {
						ball++;

					}

				}
			}

		}
		System.out.print(strike + "strike" + ball + "ball");
	}
}
//
//	public static int[] createBase() {
//		int a = (int) (Math.random() * 9) + 1;
//		int b = (int) (Math.random() * 9) + 1;
//		int c = (int) (Math.random() * 9) + 1;
//		int[] base = new int[3];
//		base[0] = a;
//		base[1] = b;
//		base[2] = c;
//		System.out.println(base[0] + "," + base[1] + "," + base[2]);
//		return base;
//	}
//
//	public static int[] printBase() {
//		int p1 = 0;
//		int p2 = 0;
//		int p3 = 0;
//		int[] print = new int[3];
//		System.out.println("값 3개를 입력하세요");
//		p1 = sc.nextInt();
//		print[0] = p1;
//		p2 = sc.nextInt();
//		print[1] = p2;
//		p3 = sc.nextInt();
//		print[2] = p3;
//		System.out.println(print[0] + "," + print[1] + "," + print[2]);
//		return print;
//	}
