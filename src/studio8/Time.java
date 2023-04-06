package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean format;
	
	public Time(int initHour, int initMinute, boolean initFormat)
	{
		hour = initHour;
		minute = initMinute;
		format = initFormat;
	}
	
	public String toString()
	{
		int newHour = hour;
		if(format == true)
		{
			if(hour > 12)
			{
				newHour = hour - 12;
			}
			return newHour + ":" + minute;

		}
		else return newHour + ":" + minute;
	}
	
	public static void main(String[] args) {
 
    	Time time1 = new Time(20, 43, true);
    	Time time2 = new Time(20, 43, false);
    	System.out.println(time1);
    	System.out.println(time2);
    	
    	System.out.println(time1.equals(time2));
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}