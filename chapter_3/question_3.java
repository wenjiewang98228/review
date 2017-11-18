package chapter_3;

import java.util.Calendar;

public class question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cl = Calendar.getInstance();
		
		int year1 = cl.get(Calendar.YEAR);
		int month1 = cl.get(Calendar.MONTH);
		int day1 = cl.get(Calendar.DAY_OF_MONTH);
		int hour1 = cl.get(Calendar.HOUR);
		int minute1 = cl.get(Calendar.MINUTE);
		
		System.out.println(year1 + "  " + month1 + "  " + day1 + "  " + hour1 + "  " + minute1);
		
		cl.add(Calendar.DAY_OF_YEAR, 100);
		
		int year2 = cl.get(Calendar.YEAR);
		int month2 = cl.get(Calendar.MONTH);
		int day2 = cl.get(Calendar.DAY_OF_MONTH);
		int hour2 = cl.get(Calendar.HOUR);
		int minute2 = cl.get(Calendar.MINUTE);
		
		System.out.println(year2 + "  " + month2 + "  " + day2 + "  " + hour2 + "  " + minute2);
	}

}
