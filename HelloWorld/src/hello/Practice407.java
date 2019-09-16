package hello;

import java.io.IOException;
import java.util.Scanner;

public class Practice407 {
	public static void main(String[] args) throws IOException { 

		int keyCode = 0;

		boolean run = true; 
		while(run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("----------------------------");
				System.out.println("선택>");
			}

			keyCode = System.in.read();

			if (keyCode == 49) {
				System.out.println("예금액>");
				System.out.println(10000);
			} else if (keyCode == 50) {
				System.out.println("출금액>");
				System.out.println(2000);
			} else if (keyCode == 51) {
				System.out.println("잔고>");
				System.out.println(8000);
			} else if (keyCode == 52) {
				run = false;
		}

		System.out.println("프로그램 종료");
	}
}
}