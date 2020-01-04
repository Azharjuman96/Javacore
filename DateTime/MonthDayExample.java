package javadatetime;
import java.time.*;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample 
{
	public static void main(String[]args)
	{
		MonthDay month=MonthDay.now();//get current month and date from system
		LocalDate date=month.atYear(2020);
		System.out.println(date);
		boolean a=month.isValidYear(2017);//check the year is valid for this date and time
		System.out.println(a);
		long b=month.get(ChronoField.MONTH_OF_YEAR);//get integer value of month
		System.out.println(b);
		//System.out.println(date);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);//range of month
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);//range of days of month
		System.out.println(r2);
		
				
	}

}
