package classes;

public class Money {

	void div50000(int a) {
		int result = a % 50000;
		int result2 = a / 50000;
		System.out.println("50000원 짜리 :" + result2+ "장, ");

		int result3 = result % 10000;
		int result4 = result / 10000;
		System.out.println("10000원 짜리 :" + result4+ "장, ");

		int result5 = result3 % 5000;
		int result6 = result3 / 5000;
		System.out.println("5000원 짜리 :" + result6+ "장, ");

		int result7 = result5 % 1000;
		int result8 = result5 / 1000;
		System.out.println("1000원 짜리 :" + result8+ "장, ");

		int result9 = result7 % 500;
		int result10 = result7 / 500;
		System.out.println("500원 짜리 :" + result10+ "장, ");

		int result11 = result9 % 100;
		int result12 = result9 / 100;
		System.out.println("100원 짜리 :" + result12+ "장, ");

		int result13 = result11 % 50;
		int result14 = result11 / 50;
		System.out.println("50원 짜리 :" + result14+ "장, ");

		int result15 = result13 % 10;
		int result16 = result13 / 10;
		System.out.println("10원 짜리 :" + result16+ "장, ");
	}

		void div5000(int a) {
		int money = a;
		int[] perAry = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] resultAry = new int[perAry.length];
		int[] remainAry = new int[perAry.length];
		System.out.println(money + "은");
		for (int i = 0; i < perAry.length; i++) {
			resultAry[i] = a / perAry[i];
			remainAry[i] = a % perAry[i];
			a = remainAry[i];
			System.out.println(perAry[i] + "원짜리 , " + resultAry[i] + "장, " + remainAry[i]);

		}
	}
}
