package hello;

public class Calender {
	public static void main(String[] args) {
		String [] Sday = {"sun","mon","tue","wed","tus","fri","sat"};
		for (int i=0; i < Sday.length; i++) {
			System.out.printf("%4s",Sday[i]);
		}
			System.out.println();
		int month = 5;
		int monthDay = getMonthday(month);
		int firstDay = getFirstday(month);
		for (int i =1; i< firstDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((firstDay + i -1) % 7 == 0) {
				System.out.println();
			}
		}
	}

	public static int getMonthday(int month) {
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

	public static int getFirstday(int month) {
		int fday = 0;
		if (month == 1) {
			fday = 3;
		} else if (month == 2) {
			fday = 6;
		} else if (month == 3) {
			fday = 6;
		} else if (month == 4) {
			fday = 2;
		} else if (month == 5) {
			fday = 4;
		} else if (month == 6) {
			fday = 7;
		} else if (month == 7) {
			fday = 2;
		} else if (month == 8) {
			fday = 5;
		} else if (month == 9) {
			fday = 1;
		} else if (month == 10) {
			fday = 3;
		} else if (month == 11) {
			fday = 6;
		} else if (month == 12) {
			fday = 1;
		}
		return fday;
	}
}
