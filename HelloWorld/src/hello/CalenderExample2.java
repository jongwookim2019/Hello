package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		System.out.println("년도");
		int year = sc.nextInt();
		System.out.println("월");
		int month= sc.nextInt();
		getCal(year, month);
	}

	private static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance(); // 현재 날짜 기준 캘린더와 연결
//		System.out.println("년:  " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("전체일수: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));	
		cal.set(year, month-1 , 1);
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Tur", "Fri", "Sat" };
		month = cal.get(Calendar.MONTH);
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("          << "+year+ " 년 " + month+1 + "월>>");
		
		for (String str : week) { // 향상된 for 용법
		System.out.printf(" " + str);
		}
	
		System.out.println();
		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", "");
		} // 1일 위치 찾아와서 새롭게 끊어주는 방법
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%4d", i);
			if ((sDay +i -1) % 7 == 0)
				System.out.println();
		}
		
	
	}
}