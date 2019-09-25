package com.yedam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	@Override // 부모메소드와 동일한 타입을 가져와서 재정의
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
}
	class Compu extends Computer {
	}
////	double areCircle1(double r) { 부모메소드의 원본 값 찾기
////		return super.areaCircle(r);
//	}

// final class 상속 불가
// final method 재정의 불가

public class ComputerExample extends Computer {
	public static void main(String[] args) {
//		Computer com = new Computer();
//		com.areaCircle(10);
//		System.out.println(com.areaCircle(10));
//		Calculator com2 = new Calculator();
//		com2.areaCircle(10);
//		System.out.println(com2.areaCircle(10));
//		Compu com3 = new Compu();
//		com3.areaCircle(10);
//		System.out.println(com3.areaCircle(10));
	}
}
