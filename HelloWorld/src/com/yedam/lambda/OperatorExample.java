package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) { // int 타입 (result, score) 값을 받아서 int 타입으로 리턴
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

//	public static void main(String[] args) {
//		IntBinaryOperator oper = new IntBinaryOperator() {
//			int result = 0;
//
//			@Override
//			public int applyAsInt(int left, int right) {
//				result = (left >= right ? left : right);
//				return result;
//			}
//		};
//		int result = minOrMax(oper);
//		System.out.println("max: " + result);
//	}
	public static void main(String[] args) {
		IntBinaryOperator oper = (left, right) -> {
			int result = 0;
			result = (left >= right ? left : right);
			return result;
		};
		int result = minOrMax(oper);
		System.out.println("max: " + result);

		result = minOrMax((x, y) -> {
			return (x <= y ? x : y);

		});
		System.out.println("min: " + result);
	}
}
