package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample1
{
public static void main(String args[])
{
	//current date
	LocalDate localdate=LocalDate.now();
	System.out.println("Today's Date is :"+localdate);
	//specific date
	LocalDate localdate2=LocalDate.of(2020,Month.JANUARY,02);
	System.out.println(localdate2);
	LocalDate localdate3=LocalDate.of(1947,Month.AUGUST,15);
	System.out.println(localdate3);
	System.out.println("Year :"+localdate.getYear());
	System.out.println("Month :"+localdate.getMonth().getValue());
	System.out.println("Day of Month :"+localdate.getDayOfMonth());
	System.out.println("Day of Week:"+localdate.getDayOfWeek());
	System.out.println("Day of Year:"+localdate.getDayOfYear());
	//Localdate's plus methods
	System.out.println("Addition of days :"+localdate.plusDays(5));
	System.out.println("Addition of Months :"+localdate.plusMonths(5));
	System.out.println("Addition of Weeks :"+localdate.plusWeeks(5));
	System.out.println("Addition of Years :"+localdate.plusYears(5));
	//Localdate's minus methods
	System.out.println("Subtraction of days :"+localdate.minusDays(5));
	System.out.println("Subtraction of Months :"+localdate.minusMonths(5));
	System.out.println("Subtraction of Weeks :"+localdate.minusWeeks(5));
	System.out.println("Subtraction of Years :"+localdate.minusYears(5));
	//isEqual() example
	if(localdate.isEqual(localdate2))
	{
		System.out.println("localdate1 and localdate2 are equal");
	}
	else
	{
		System.out.println("localdate1 and localdate2 are not equal");	
	}
	//ifAfter() example
	if(localdate2.isAfter(localdate3))
	{
		System.out.println("localdate1 comes after localdate2 ");
	}
	//isBefore() example
	if(localdate3.isBefore(localdate))
	{
		System.out.println("localdate3 comes before localdate");
	}
}
}