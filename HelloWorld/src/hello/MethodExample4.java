package hello;

import javax.xml.transform.Source;

public class MethodExample4 {
	public static void main(String[] args) {
		showCal(1);
	}

	public static void showCal(int mon) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Tur", "Fri", "Sat" };
		int month = mon;
		int monthDay = getMonthday(month);
		int sDay = getStartday(month);
		System.out.println("               << " + mon + "월달>>");
		// 요일 타이틀 출력
//		for (int i =0; i <week.length; i++) {
//			System.out.printf(" "+ week[i]);		
//		}
		for (String str : week) { // 향상된 for 용법
			System.out.printf(" " + str);
		}
		System.out.println();
		// 1일의 위치 지정.
		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", "");
		} // 1일 위치 찾아와서 새롭게 끊어주는 방법
		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay +i -1) % 7 == 0)
				System.out.println();
		}
	}

	public static int getStartday(int month) { // 시작날 입력
		int startDay = 0;
		if (month == 9) {
			startDay = 1; // 일요일
		} else if (month == 10) {
			startDay = 3; // 화요일
		} else if (month == 11) {
			startDay = 6; // 금요일
		} else if (month == 8) {
			startDay = 5; // 목요일
		} else if (month == 1) {
			startDay = 3;
		} else if (month == 2) {
			startDay = 6;
		} else if (month == 3) {
			startDay = 6;
		} else if (month == 4) {
			startDay = 2;
		} else if (month == 5) {
			startDay = 4;
		} else if (month == 6) {
			startDay = 7;
		} else if (month == 7) {
			startDay = 2;
		} else if (month == 12) {
			startDay = 1;
		}
		return startDay;
	}

	public static int getMonthday(int month) { // 월별 날짜 입력
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else {
			day = 30;

		}
		return day;

	}

}