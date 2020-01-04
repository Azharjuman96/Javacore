package javadatetime;
import java.time.LocalTime;

public class TimeExample1
{ 
   public static void main()
   {
	   //current time
	   LocalTime localTime=LocalTime.now();
	   System.out.println(localTime);
	   
	   // specific Time
	   LocalTime localTime2 = LocalTime.of(4,30,45);
	   System.out.println(localTime2);
	   System.out.println("Hour : "+ localTime.getHour());
	   System.out.println("Minute :" + localTime.getMinute());
	   System.out.println("Second :" + localTime.getSecond());
       
	   //LocalTimes plus method
	   System.out.println("Addition of Hours : "+ localTime.plusHours(2));
	   System.out.println("Addition of Minutes : "+ localTime.plusMinutes(30));
	   System.out.println("Addition of Seconds : "+ localTime.plusSeconds(2));
	   System.out.println("Addition of Nanos : "+ localTime.plusNanos(2));
	   
	   LocalTime localTime3 = LocalTime.of(11, 45, 20);
	   
	   //compareTo() example 
	   if(localTime.compareTo(localTime2)== 0)
	   {
		   System.out.println("localdate and localdate2 are equal");
	   }
	   else
	   {
		   System.out.println("localdate and localdate2are not equal");
	   }
	   
	   //isBefore() example
	   if(localTime2.isBefore(localTime3))
	   {
		   System.out.println("localdate2 comes before localTime3");
	   }
	   //isAfter() example
	   if(localTime3.isAfter(localTime))
	   {
		   System.out.println("localTime3 comes after localTime1");
	   }
   }

}
