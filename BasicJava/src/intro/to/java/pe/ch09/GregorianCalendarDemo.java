package intro.to.java.pe.ch09;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		
		// Display the current year, month, and day
		System.out.println("Current Year, Month, and Day");
		System.out.println("Year: " + calendar.get(Calendar.YEAR)
				+ "\nMonth: " + calendar.get(Calendar.MONTH)
				+ "\nDay: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		// setTimeInMillis(long millis)
		calendar.setTimeInMillis(123456789765L);
		System.out.println("\nSet Time to Milliseconds");
		System.out.println("Year: " + calendar.get(Calendar.YEAR)
				+ "\nMonth: " + calendar.get(Calendar.MONTH)
				+ "\nDay: " + calendar.get(Calendar.DAY_OF_MONTH));
		
	}
}
