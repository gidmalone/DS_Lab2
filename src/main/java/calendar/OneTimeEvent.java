package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class OneTimeEvent extends CalendarEvent {

	public OneTimeEvent(String description, String location, GregorianCalendar startTime, GregorianCalendar endTime) {
		super(description, location, startTime, endTime);
		// TODO Auto-generated constructor stub
	}

	public void scheduleEvent(Calendar MeetingCalendar) {
	}
}
