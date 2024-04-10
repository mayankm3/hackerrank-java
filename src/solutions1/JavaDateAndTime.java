package solutions1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class JavaDateAndTime {
	
	static int month, day, year;
	
	public static void main(String[] args) {
		
		LocalDate date = java.time.LocalDate.now(); //2021-11-10 
		String syear = String.valueOf(date).substring(0, 4);
		year = Integer.parseInt(syear);
		String smonth = String.valueOf(date).substring(5, 7);
		month = Integer.parseInt(smonth);
		String sday = String.valueOf(date).substring(8);
		day = Integer.parseInt(sday);
		
		/*
		 * String input = String.valueOf(date); DateTimeFormatter dtf =
		 * DateTimeFormatter.ofPattern("u-M-d", Locale.ENGLISH); LocalDate date1 =
		 * LocalDate.parse(input, dtf); DayOfWeek dow = date1.getDayOfWeek();
		 * System.out.println(dow);
		 */
		
		String dayInCapitals = findDay(month, day, year);
		System.out.println(dayInCapitals);
	}
	
	
	 public static String findDay(int month, int day, int year) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("u-M-d", Locale.ENGLISH);
		 LocalDate date1 = LocalDate.parse(month+"-"+01+"-"+year, dtf);
		 DayOfWeek dow = date1.getDayOfWeek();
		 return String.valueOf(dow);		 
	 }
	 
}
