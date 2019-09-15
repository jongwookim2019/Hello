package hello;

import java.util.Scanner;

public class Practice407 {
public static void main(String[] args) {
	boolean run = true;
	
	int balance = 0;
	int keyCode = 0;
	
	while(run) {
		if(keyCode!=13 && keyCode!=10) {
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.println("선택>");
		}
		
		keyCode = System.in.read();
		
	Scanner scanner = new Scanner(System.in);
	String inputString;
	
	do {
		
		if (keyCode == 49) {
		System.out.println("예금액>");
		inputString = scanner.nextLine();
		System.out.println(10000);
		} else if (keyCode == 50) {
			System.out.println("출금액>");
			inputString = scanner.nextLine();
			System.out.println(2000);
			}	else if (keyCode == 51) {
				System.out.println("잔고>");
				inputString = scanner.nextLine();
				System.out.println(8000);
				}	else if (keyCode == 52)
						break;
	}
			}	
		System.out.println("프로그램 종료");
	}
}



