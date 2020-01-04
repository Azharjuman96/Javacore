package javadatetime;

import java.time.OffsetDateTime;

public class JavaOffsetDateTimeExample 
{
	public static void main(String[]args)
	{
		OffsetDateTime offSetDT=OffsetDateTime.now();
		System.out.println(offSetDT.getDayOfMonth());
		System.out.println(offSetDT.getDayOfYear());
		System.out.println(offSetDT.getDayOfWeek());
		System.out.println(offSetDT.toLocalDate());
		OffsetDateTime value1 =offSetDT.minusDays(240);
		System.out.println(value1);
		OffsetDateTime value2 =offSetDT.plusDays(240);
		System.out.println(value2);
		
	}

}
