package com.yedam.lambda;

interface MyLocalInterface {
	public void method();
}

public class UsingLocalVariable {
	void method(int arg) { // final 변경불가.
		int localVal = 0; // final 변경불가.
		arg = 20;
		localVal = 20;

		MyLocalInterface lif = () -> {
			arg = 10;
			localVal = 20;
			System.out.println(arg);
			System.out.println(localVal);
			System.out.println();
		};
	}

}
