package hello;

public class ArryExample4 {
	public static void main(String[] args) {
		char chr = 'A';
		int num = chr;
//		for (chr = 'A'; chr < 91; chr++) {
//			System.out.print(chr + "," + num++ + " ");
//			if (num % 5 == 0) {
//				System.out.println();
//		for (int i =0; i <26; i++) {
//			System.out.println(chr++ + "," + num++ + " ");

		// 배열 복사하는법... 1,2
		String[] strAry = { "Hello", "World", "Good", "Morning" };
		String[] copyAry = new String[strAry.length];
//		for (int i = 0; i < strAry.length; i++) {
//			copyAry[i] = strAry[i];
//		}
//		for (String str : copyAry) {
//			System.out.println(str);

		
		// 메소드 이용 배열 복사 하는법
		System.arraycopy(strAry, 0, copyAry, 0, 2);
		for (String str : copyAry) {
			System.out.println(str);
		}
	}
}
