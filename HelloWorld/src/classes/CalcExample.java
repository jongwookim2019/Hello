package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		//응용인데 봉인
//		int [] ary = new int[2];
//		int i = 0;
//		cal.execute(i, i);
//		for (int j = 0; j < ary.length; j++) {
//			System.out.print("값을 입력하세요");
//			ary[j] = scanner.nextInt();
//		}
//		cal.execute(ary[0], ary[1]);
		
		System.out.print("첫번째 값을 입력하세요 :");
		int a = scanner.nextInt();
		System.out.print("두번째 값을 입력하세요 :");
		int b = scanner.nextInt();
		cal.execute(a, b);

	}
}
