package hello;

public class Example0919 {
	public static void main(String[] args) {
		char chr = 'A';
		int num = chr;
		for (chr = 'A'; chr < 91; chr++) {
			System.out.print(chr + "," + num++ + " ");
			if (num % 5 == 0) {
				System.out.println();
			}
		}
	}
}
