package assignment05;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import static java.time.temporal.ChronoUnit.DAYS;
import java.time.format.DateTimeFormatter;

public class CalendarEntry {
	private LocalTime startTime;
	private LocalTime endTime;
	private LocalDate date;
	private ChronoUnit period;
	private DayOfWeek day;
	private String description;
	private String location;

	public CalendarEntry(LocalTime startTime, LocalTime endTime,
							ChronoUnit period) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.period = period;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public LocalDate getDate() {
		return date;
	}

	public ChronoUnit getPeriod() {
		return period;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public void setDate(LocalDate date) {
		this.date = date;
		day = date.getDayOfWeek();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	/**
 	* Make a copy of this CalendarEntry but with the next later day given by the parameter.
 	* For example, if this.date is February 20, 2017,
 	* which is Monday, then copyTo(Friday) should give a CalendarEntry for February 24, 2017.
 	* @param newDay the day required of the new CalendarEntry
 	* @return a new CalendarEntry with the date moved so that day matches newDay
	*/
	public CalendarEntry copyTo(DayOfWeek newDay) {
		CalendarEntry temp = new CalendarEntry(startTime, endTime, period);
		LocalDate tempDate = date;
		while (tempDate.getDayOfWeek() != newDay) {
			tempDate = tempDate.plus(1, DAYS);
			//System.out.println("debugging " + tempDate);
		}
		temp.setDate(tempDate);
		temp.setDescription(description);
		temp.setLocation(location);
		return temp;
	}

	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EE MMMM dd, yyyy");
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		return description + ", " + location + ", " + date.format(df)
				+ " from " + startTime.format(tf) 
				+ " to " + endTime.format(tf);
	}

	public boolean meetsOn(LocalDate aDate) {
		return date.equals(aDate);
	}
}