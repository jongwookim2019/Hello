package Test;

public class Test2 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int result = (a > b ? a++ : b--);
		System.out.println("결과: "+ result + a + b);
	}
}
