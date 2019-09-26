package Paactice0926;

import java.util.Scanner;

public class BaseballExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int a = (int) (Math.random() * 9) + 1;
		int b = (int) (Math.random() * 9) + 1;
		int c = (int) (Math.random() * 9) + 1;
		int[] base = new int[3];
		base[0] = a;
		base[1] = b;
		base[2] = c;
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
		for (int i =0; i<100; i++) {
			if (createBase() == printBase()) {
				System.out.println("3Strike");
				break;
			}else if (base[0] == print[0] & ) {
				
			}
		}

//		if (base[0] == ) {
//			stop();
//			return 1; // 왼쪽 앞바퀴가 문제가 발생하면 1값을 보내겠다.
//		} else if (tlocation[1].roll() == false) {
//			stop();
//			return 2; // 오 앞 문 2
//		} else if (tlocation[2].roll() == false) {
//			stop();
//			return 3; // 왼 뒤 문 3
//		} else if (tlocation[3].roll() == false) {
//			stop();
//			return 4; // 오 뒤 문 4
//		}
//		return 0; // 고장난 부분이 없다.	
//	}
//
//	void stop() {
//		System.out.println("[자동차가 멈춥니다]");

	}
	public static int[] createBase() {
		int a = (int) (Math.random() * 9) + 1;
		int b = (int) (Math.random() * 9) + 1;
		int c = (int) (Math.random() * 9) + 1;
		int[] base = new int[3];
		base[0] = a;
		base[1] = b;
		base[2] = c;
		System.out.println(base[0] + "," + base[1] + "," + base[2]);
		return base;
	}

	public static int[] printBase() {
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
		return print;
	}
}