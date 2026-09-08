package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeeklyEvent extends CalendarEvent {
	private GregorianCalendar repeatUntil;

	public WeeklyEvent(String description, String location, GregorianCalendar startTime, GregorianCalendar endTime, GregorianCalendar repeatUntil) {
		super(description, location, startTime, endTime);
		this.repeatUntil = repeatUntil;
		// TODO Auto-generated constructor stub
	}
	
	public void scheduleEvent(Calendar MeetingCalendar) {
	}

	public GregorianCalendar getRepeatUntil() {
		return repeatUntil;
	}

	public void setRepeatUntil(GregorianCalendar repeatUntil) {
		this.repeatUntil = repeatUntil;
	}
}
