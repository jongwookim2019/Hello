package hello;

public class MethodExample3 {
	public static void main(String[] args) {
		int[] ary = null;
		int[] Aary = null;
		ary = showAray(1, 2, 3, 4, 5);
		System.out.println(ary);
		Aary = showArray(6, 7, 8, 9, 10);
		System.out.println(Aary);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}

		for (int j = 0; j < Aary.length; j++) {
			System.out.println(Aary[j]);
		}
		// ==>> enhanced for
		for (int a : ary) {
			System.out.println(a);
		}
		
		
	}

	public static int[] showAray(int a, int b, int c, int d, int e) {
		int[] ary = { a, b, c, d, e };
		return ary;
	}

	public static int[] showArray(int... arg) {
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}

//		int[] intAry = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		sum = sumArray(intAry);
//		System.out.println("합은 : " + sum);
//
//		int[] intAry2 = { 1, 2, 3, 4, 5, 6 };
//		sum = sumArray(intAry2);
//		System.out.println("합은 : " + sum);
//
//		int[] intAry3 = { 1, 2, 3 };
//		sum = sumArray(intAry3);
//		System.out.println("합은 : " + sum);
//		printStar(8);

}

//	public static void printStar(int a) {
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < a; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
//	}
//
//	public static int sumArray(int[] ary) {
//		int sum = 0;
//		for (int i = 0; i < ary.length; i++) {
//			sum += ary[i];
//		}
//		return sum;
//	}
