package com.yedam;

class Parent {
	void method1() {
		System.out.println("부모클래스의 메소드1.");
	}

	void method2() {
		System.out.println("부모클래스의 메소드2.");
	}
}

class Child extends Parent {
	@Override
	void method1() {
		System.out.println("자식클래스의 메소드1.");
	}

	@Override
	void method2() {
		System.out.println("자식클래스의 메소드2.");

	}

	void method3() {
		System.out.println("자식클래스의 메소드3.");
	}
}

public class ParentExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		Parent p1 = c1; // 자동 형변환. 부모클래스는 자식클래스의 데이터를 받을 수 있지만 자식클래스에만 존재하는 메소드는 받을수 없다.
		p1.method1();
		p1.method2(); // override 될 경우 자식클래스의 메소드를 호출함
//		p1.method3();  error
		if (p1 instanceof Child) { // 조건 만족시 실행 o p1이 c1의 데이터를 받았기 떄문에 p1은 child의 인스턴스를 가지고 있음 그러므로 실행 o
			c1 = (Child) p1;
			c1.method1();
			c1.method2();
			c1.method3();
		}

		Parent p2 = new Parent();
//		p2.method1();
//		p2.method2();
		if (p2 instanceof Child) { // 실행 오류 방지 조건 만족x 실행 x p2는 부모클래스를 받음 p2는 부모인스턴스를 가지고 있기 떄문에 조건 부합 실행 ㅌ
			c1 = (Child) p2; // 실행시점에 오류 발생 프로그램상 오류 x
			c1.method1();
			c1.method2();
			c1.method3();

		}

	}
}
