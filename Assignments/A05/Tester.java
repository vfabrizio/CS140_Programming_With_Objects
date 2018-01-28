package assignment05;

import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tester  {
	public static void main(String[] args) {
		CalendarEntry c1 = new CalendarEntry(LocalTime.of(10, 50),
							LocalTime.of(11, 50), null);
		c1.setDate(LocalDate.of(2017, 1, 18));
		c1.setDescription("CS 140");
		c1.setLocation("UU 108");
		CalendarEntry c2 = c1.copyTo(FRIDAY);
		CalendarEntry c3 = c1.copyTo(MONDAY);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}