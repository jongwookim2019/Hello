package hello;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println(args[0]);
		int a = 50;
		int [] Ary = {2, 3, 4, 5, 6,};
		double c = 170;
		showName();
		showAge(a);
		showMe(c, 65.5);
		int result = sum(4, 5);
		System.out.println("결과값: " + result);
		int result1 = minus(7, 6);
		System.out.println("빼기 결과값: " + result1);
		double result2 = mult(5.5, 6.5);
		System.out.println("곱하기 결과값: " + result2);
		double result3 = div(7, 5);
		System.out.println("나누기 결과값 " + result3);
		System.out.println(result2 + result3);
		double result4 = height(170);
		System.out.println("적정몸무게는 :" +result4);
		System.out.println(args[1]);
		int result5 =sum2(Ary);
		System.out.println(result5);
	}
	
	public static int sum2(int[] Ary) {
		int sum =0;
		for(int i=0; i<Ary.length; i++) {
			sum += Ary[i];
		}
		return sum;
	}
	

	public static double height(double a) {
		return (a -100)*0.9;
	}
	
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static double mult(double e, double f) {
		return e * f;
	}

	public static double div(double i, double j) {
		return i / j;
	}

	public static void showMe(double height, double weight) {
		System.out.println("I am " + height + " cm and " + weight + " kg");
	}

	public static void showAge(int age) {
		System.out.println("I am " + age + " years old.");
	}

	public static void showName() {
		System.out.println("Hello, my name is Changho.");
	}
}
