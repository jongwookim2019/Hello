package com.yedam.lambda;

@FunctionalInterface // 람다식 계산기

interface MyInterface { // 인터페이스인데 구현할 메소드가 하나만 있을 경우 람다식 사용가능
	int print(int a, int b);

}

public class LambdaBasicExample {

	public static void main(String[] args) {
//		MyInterface mi = new MyInterfaceClass();
//		int result = mi.print(4, 9);
//		System.out.println("결과값은: " + result);

		MyInterface mi = (c, d) -> {
			return c * d;
		};
		int result = mi.print(3, 5);
		System.out.println("결과값은: " + result);

		mi = (a, b) -> {
			return a - b;
		};
		result = mi.print(7, 4);
		System.out.println("결과값은: " + result);
		
		// mi.print(4, 8) --> 4+8의 결과는 12입니다.
		
		mi = (a, b) -> {
			return a / b;
		};
		System.out.println("결과값은: " + mi.print(8, 4));
	}
}
