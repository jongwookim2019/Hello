package hello;

public class Triangle {
	public static void main(String[] args) {
		printStar(5);
		
	}
	public static void printStar(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}

