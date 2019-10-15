package com.yedam.lambda;

interface MyInterfaceNoargs {
	public void method1();
}

interface MyInterfaceWighArgs {
	public void method2(int a);
}

interface MyInterfaceWithReturn {
	public int method3(int a, int b);
}

public class LamdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoargs fina = () -> {
			System.out.println("no arguments expression.");

		};
		fina.method1();

		MyInterfaceWighArgs fiwa = (a) -> {
			System.out.println("retult is " + a * 3);
		};
		fiwa.method2(5);

		MyInterfaceWithReturn fiwr = (a, b) -> {
			return a + b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과값은: " + result);
	}
}
