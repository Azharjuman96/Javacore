package javadateclassical;

import java.util.Calendar;

//import java.Calendar;
public class JavaCalenderExample
{
	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println("The current date is :"+calendar.getTime());
		calendar.add(Calendar.DATE, -15);
		System.out.println("15 days go: "+calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4 month later: "+calendar.getTime());
		calendar.add(Calendar.YEAR, 2);
		System.out.println("2 years later: "+calendar.getTime());
		System.out.println("At present Calender's Year: "+calendar.get(Calendar.YEAR));
		System.out.println("At present Calender's Day: "+calendar.get(Calendar.DATE));
		System.out.println("At present Date And Time is : "+calendar.getTime());
		int maximum =calendar.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("maximum number of days in week : "+maximum);
		maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("maximum number of weeks  in year : "+maximum);
		int minimum =calendar.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("minimum number of days in week : "+minimum);
		minimum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("minimum number of weeks  in year : "+minimum);

		
		
		
		
		
		
	}

}
