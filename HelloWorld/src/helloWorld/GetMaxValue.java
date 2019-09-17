package helloWorld;

import java.util.Scanner;

public class GetMaxValue {

	public static void main(String[] args) {
		int[] Ary = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < Ary.length; i++) {
			System.out.println("정수값 배열");
			Ary[i] = sc.nextInt();
	}
		int maxValue=0;
		for (int i = 0; i <Ary.length; i++) {
			maxValue = (maxValue > Ary[i] ? maxValue : Ary[i]);
		}
		System.out.println("제일 큰 값은: " + maxValue);
}
}