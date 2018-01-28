package assignment05;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.DayOfWeek.*;

public class Tester2 {
	public static void main(String[] args) {
		ClassSchedule cs140 = new ClassSchedule();
		Weekly lecWed = new Weekly(LocalTime.of(10, 50), 
			LocalTime.of(11, 50), LocalDate.of(2017, 1, 18));
		lecWed.setEndDate(LocalDate.of(2017, 5, 9));
		lecWed.setDescription("CS 140 Class");
		lecWed.setLocation("UU 108");
		Weekly lecFri = lecWed.copyTo(FRIDAY);
		Weekly lecMon = lecWed.copyTo(MONDAY);

		Weekly lab = new Weekly(LocalTime.of(14, 50), 
			LocalTime.of(16, 15), LocalDate.of(2017, 1, 19));
		lab.setEndDate(LocalDate.of(2017, 5, 9));
		lab.setDescription("CS 140 Lab");
		lab.setLocation("LNG 103");

		cs140.addClassDay(lecMon);
		cs140.addClassDay(lecWed);
		cs140.addClassDay(lecFri);
		cs140.addClassDay(lab);

		Daily wBreak = new Daily(LocalTime.of(0, 1),LocalTime.of(23, 59),
								LocalDate.of(2017, 3, 3));
		wBreak.setEndDate(LocalDate.of(2017, 3, 7));

		Daily sBreak = new Daily(LocalTime.of(0, 1),LocalTime.of(23, 59),
								LocalDate.of(2017, 4, 8));
		sBreak.setEndDate(LocalDate.of(2017, 4, 17));

		cs140.addSkipDay(wBreak);
		cs140.addSkipDay(sBreak);

		for(LocalDate d = LocalDate.of(2017, 1, 18);
			d.isBefore(LocalDate.of(2017, 5, 10)); d = d.plusDays(1)) {
			if(cs140.meetsOn(d)) {
				System.out.println(cs140.getCopyForDay(d));
			}		
		}
	}
}