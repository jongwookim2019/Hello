package hello;

public class Calender {
	public static void main(String[] args) {
		int month = 1;
		int monthDay = getMonthday(month);
	for (int i =0; i<monthDay; i++) {
		System.out.println(monthDay);
	}

}

	public static int getMonthday(int month) {
	int day = 0;
	if (month == 2) {
		day = 28;
	} else if(month <= 7 && 2 == 1) {
		day = 31;
	} else if(month >= 8 && 2 == 0) {
		day = 31;
	} else {
		day = 30;
		
	}
	return day;
}
}

