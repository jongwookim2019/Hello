package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		Scanner sc = new Scanner(System.in);
//		System.out.println("input int type");
//		intAry[0] = sc.nextInt();
//		System.out.println("next input");
//		intAry[1] = sc.nextInt();
//		System.out.println("next input");
//		intAry[2] = sc.nextInt();
//		System.out.println("next input");
//		intAry[3] = sc.nextInt();
//		System.out.println("next input");
//		intAry[4] = sc.nextInt();
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("정수형 데이터 입력:");
			intAry[i] = sc.nextInt();
		}
		for (int i = 0; i < intAry.length; i++)
			System.out.println(intAry[i]);
	}

}
