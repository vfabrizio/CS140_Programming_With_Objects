package assignment05;

import static java.time.temporal.ChronoUnit.DAYS;
import java.time.LocalTime;
import java.time.LocalDate;

public class Daily extends CalendarEntry {
	private LocalDate endDate;

	public Daily(LocalTime startTime, LocalTime endTime, LocalDate date) {
		super(startTime, endTime, DAYS);
		if (date == null) {
			throw new IllegalArgumentException("The date must not be null");
		}
		setDate(date);
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getEndDate() {
		return endDate;
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
			temp = temp.plusDays(1);
			if (temp.isAfter(aDate)) {
				return false;
			}
		}
		return true;
	}
}