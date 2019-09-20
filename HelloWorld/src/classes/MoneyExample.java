package classes;

import java.util.Scanner;

public class MoneyExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		Money mon = new Money();
		mon.div50000(567780);
		mon.div5000(567780);
//		int a = scanner.nextInt();
//		int money = a;
//		int result = 0, remain = 0; 
//		int[] perAry = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		int[] resultAry = new int[perAry.length];
//		int[] remainAry = new int[perAry.length];
//		System.out.println(money + "은");
//		for (int i = 0; i < perAry.length; i++) {
//			resultAry[i] = a / perAry[i];
//			remainAry[i] = a % perAry[i];
//	        a = remainAry[i];
//			System.out.println(perAry[i]+"원짜리 , " + resultAry[i]+ "장, "+ remainAry[i]);

//		int [] perMoney = {50000,10000,5000,1000,500,100,50,10};
//		int result=0, remain=0;
//		int money = a;
//		int a = scanner.nextInt();
//		for (int i =0; i <perMoney.length; i++) {
//		result = money/perMoney[i];
//		remain = money%perMoney[i];
//		System.out.println(perMoney[i] + "원짜리: "+ result);
//		money = remain;

		}
	}

