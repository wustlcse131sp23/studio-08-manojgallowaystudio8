package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date initDate,Time initTime)
	{
		date = initDate;
		time = initTime;
	}

	
	public static void main(String[] args)
	{
		Date date1 = new Date(3,3,2097,false);
		Time time1 = new Time(23,59,false);
		Appointment tooth = new Appointment(date1, time1);
		
		Date date2 = new Date(3,3,2097,false);
		Time time2 = new Time(23,59,false);
		Appointment eye = new Appointment(date2, time2);
		
		Date date3 = new Date(3,3,2098,false);
		Time time3 = new Time(23,59,false);
		Appointment othereye = new Appointment(date3, time3);
		
		System.out.println(tooth.equals(eye));
		
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		
		calendar.add(eye);
		calendar.add(tooth);
		calendar.add(othereye);
		
		System.out.println(calendar);
	}
	
	public String toString()
	{
		return date + " " + time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	
}
