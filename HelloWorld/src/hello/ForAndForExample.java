package hello;

public class ForAndForExample {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println("<<" + i + "단>>");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
//		
			int a = 2;
			while (a < 10) {
				System.out.println("<<" + i + "단>>");
				int b = 1;
				while (b < 10) {
					System.out.println(a + "*" + b + "=" + a * b);
					b++;
				}
				a++;
			}
		}
	}
}