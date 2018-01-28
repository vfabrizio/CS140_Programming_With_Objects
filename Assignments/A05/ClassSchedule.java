package assignment05;

import java.util.ArrayList;
import java.time.LocalDate;

public class ClassSchedule {
	private ArrayList<Weekly> classDays = new ArrayList<>();
	private ArrayList<Daily> skipDays = new ArrayList<>();

	public void addClassDay(Weekly week) {
		classDays.add(week);
	}

	public void addSkipDay(Daily day) {
		skipDays.add(day);
	}

	public boolean meetsOn(LocalDate aDate) {
		for (Daily d : skipDays) {
			if (d.meetsOn(aDate)) {
				return false;
			}
		}
		
		for (Weekly w : classDays) {
			if (w.meetsOn(aDate)) {
				return true;
			}
		}
		return false;
	}

	public Weekly getCopyForDay(LocalDate aDate) {
		for (Weekly obj : classDays) {
			if (obj.meetsOn(aDate)) {
				return obj.copy(aDate);
			}
		}
		return null;
	}
}