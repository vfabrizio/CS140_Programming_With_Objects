package assignment05;

import static java.time.temporal.ChronoUnit.WEEKS;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;
import static java.time.temporal.ChronoUnit.DAYS;

public class Weekly extends CalendarEntry {
	private LocalDate endDate;

	public Weekly(LocalTime startTime, LocalTime endTime, LocalDate date) {
		super(startTime, endTime, WEEKS);
		if (date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		setDate(date);
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public boolean meetsOn(LocalDate aDate) {
		if (endDate != null) {
			if (aDate.isBefore(getDate()) || 
					aDate.isAfter(endDate)) {
				return false;
			}
		}
		LocalDate temp = getDate();
		while (temp.isBefore(aDate)) {
			temp = temp.plusWeeks(1);
			if (temp.isAfter(aDate)) {
				return false;
			}
		}
		return true;
	}

	public Weekly copy(LocalDate aDate) {
		Weekly temp = new Weekly(getStartTime(), getEndTime(), aDate);
		temp.setDescription(getDescription());
		temp.setLocation(getLocation());
		return temp;
	}

	@Override
	public Weekly copyTo(DayOfWeek newDay) {
		Weekly temp = new Weekly(getStartTime(), getEndTime(), getDate());
		LocalDate tempDate = getDate();
		while (tempDate.getDayOfWeek() != newDay) {
			tempDate = tempDate.plus(1, DAYS);
			//System.out.println("debugging " + tempDate);
		}
		temp.setDate(tempDate);
		temp.setEndDate(getEndDate());
		temp.setDescription(getDescription());
		temp.setLocation(getLocation());
		return temp;
	}
}