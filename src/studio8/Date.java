package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	public Date(int initMonth, int initDate, int initYear, boolean initHoliday)
	{
		month = initMonth;
		day = initDate;
		year = initYear;
		isHoliday = initHoliday;
	}
	
	public String toString()
	{
		return month + "/" + day + "/" + year + ". Is Holiday? " + isHoliday;
	}


    public static void main(String[] args) {
    	Date bday = new Date(8, 26, 2004, false);
    	Date bday2 = new Date(8, 26, 2004, true);
    	Date jesusDay = new Date(12, 25, 0, true);
    	Date bday3 = new Date(9,22,2003,false);
    	Date march5 = new Date(3,5,1956,false);
    	Date nov11 = new Date(11,11,1918,true);
    	
    	LinkedList <Date> list = new LinkedList<Date>();
    	list.add(jesusDay);
    	list.add(nov11);
    	list.add(march5);
    	list.add(bday3);
    	list.add(bday);
    	list.add(bday);
    	
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(jesusDay);
    	set.add(nov11);
    	set.add(march5);
    	set.add(bday3);
    	set.add(bday);
    	set.add(bday);
    	
    	System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
    
    

}
