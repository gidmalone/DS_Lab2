import java.util.Calendar;
import java.util.GregorianCalendar;

public class MultiDayPerWeekEvent extends CalendarEvent {
	private GregorianCalendar repeatUntil;
	private int[] days;
	
	public MultiDayPerWeekEvent(String description, String location, GregorianCalendar startTime,
			GregorianCalendar endTime, GregorianCalendar repeatUntil, int[] days) {
		super(description, location, startTime, endTime);
		this.repeatUntil = repeatUntil;
		this.days = days;
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

	public int[] getDays() {
		return days;
	}

	public void setDays(int[] days) {
		this.days = days;
	}
	
	
}
