package classes;

public class Calculator {
	static double pi = 3.14;
	static double plus(double x, double y) {
		return x + y;
	}
	static double minus(double a, double b) {
		return a - b;
	}
		int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int a, int b) {
		double sum = plus(a, b);
		double result = sum / 2;
		return result;
	}
// 정의하는 곳에만 데이터 타입을 입력해줄것 
	void execute (int a, int b) {
		double result = avg(a, b);
		println("result: " + result);
	}

	// 화면 출력 메소드
	void println(String str) {
		System.out.println(str);
	}

}
