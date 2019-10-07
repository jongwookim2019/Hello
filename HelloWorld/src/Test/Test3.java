package Test;

public class Test3 {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int d = (a * b);
		int max = 200;
		int result = 0;
		for (int i = 0; i < 10; i++) {
			if (d < max) {
				result = d * i;
				

			}
		}
		System.out.println(result);

	}
}
