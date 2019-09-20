package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		Calculator.plus(23.5,10.2); //static 클래스 차원에서 쓸일은 잘 없다.
		Calculator.minus(22.5,10.3);
		
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
