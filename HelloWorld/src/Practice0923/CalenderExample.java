package Practice0923;

import java.util.Calendar;

public class CalenderExample {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	System.out.println("년:  "+ cal.get(Calendar.YEAR));
	System.out.println("월: "+ cal.get(Calendar.MONTH));
	System.out.println("요일: "+ cal.get(Calendar.DAY_OF_WEEK));
	System.out.println("일: "+ cal.get(Calendar.DAY_OF_MONTH));
	System.out.println("============");
	System.out.println("년:  "+ cal.get(Calendar.YEAR));
	System.out.println("월: "+ cal.get(Calendar.MONTH));
	System.out.println("요일: "+ cal.get(Calendar.DAY_OF_WEEK));
	System.out.println("일: "+ cal.get(Calendar.DAY_OF_MONTH));
	System.out.println("전체일수: "+ cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	getCal(2018, 5);
}

//private static void getCal(int i, int j) {
//	System.out.println("년:  "+ cal.get(Calendar.YEAR));
//	System.out.println("월: "+ cal.get(Calendar.MONTH));
//	System.out.println("요일: "+ cal.get(Calendar.DAY_OF_WEEK));
//	System.out.println("일: "+ cal.get(Calendar.DAY_OF_MONTH));
//	System.out.println("전체일수: "+ cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	
}

