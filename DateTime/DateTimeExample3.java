package javadatetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample3 
{
	public static void main(String Args[])
	{
		//ISO DAte
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter dateformatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateformatter));
		
		// yyyy/mm/dd pattern
		DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(localDate.format(dateFormatter1));
		
		//mmmm dd,yyyy pattern
		DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(localDate.format(dateFormatter2));
		
		//dd-MMMM-yyyy pattern
		
		DateTimeFormatter dateFormatter3=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println(localDate.format(dateFormatter3));
		
		//dd-LL-yyyy pattern
		DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println(localDate.format(dateFormatter4));
	}

}
