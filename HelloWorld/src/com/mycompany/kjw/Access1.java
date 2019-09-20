package com.mycompany.kjw;

class Access2 {
	public Access2() {
		System.out.println("Access2");
	}
}

public class Access1 {
	public int field1;
	int field2;
	private int field3; // class 내에서만 접근 가능
	public void method1() {
		field3 = 10;
		System.out.println("method1");
	}
	void method2() {
		System.out.println(field3);
		System.out.println("method2");
	}
	private void method3() {
		System.out.println("method3");
	}
	public Access1() {
		System.out.println("Access1");
	}
}
