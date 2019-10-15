package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}

	int instanceSum(int x, int y) {
		return x + y;
	}
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10, b = 20, result = 0;
		Calculator.staticSum(a, b);

		Calculator cal = new Calculator();
		cal.instanceSum(a, b);

		IntBinaryOperator oper;
		oper = Calculator::staticSum; // static 메소드2
		result = oper.applyAsInt(a, b);
		System.out.println("정적 메소드 참조2: " +result);
		
		System.out.println("==============================================");
		
		//인스턴스 메소드 1,2
		oper = (x,y) -> {
			return cal.instanceSum(x, y);
			
		}; // 인스턴스 메소드1
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스 메소드 참조:1 " +result);
		
		oper =  cal::instanceSum; //인스턴스 메소드2
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스 메소드 참조:2 " +result);
		
		
	}
}
