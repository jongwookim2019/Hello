package hello;

public class Forexample {
public static void main(String[] args) {
	int sum = 0;
	sum = sum + 1;
	sum = sum + 2;
	sum = sum + 3;
	sum = sum + 4;
	sum = sum + 5;
	sum = 0;
	for (int i = 1; i <= 5; i++) {
		sum = sum + i;
		if (i > 5) {
		System.out.println(i);
		}
	}
	System.out.println(sum);
}
}
