package JavaCollection;
import java.util.*;
public class SetExample3 
{
	public static void main(String[] args)
	{
		Scanner p=new Scanner(System.in);
		
		Set<String>a=new HashSet<String>();
		System.out.println("Is popularCities set empty? :"+a.isEmpty());
		int n=p.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(p.next());
		}
		System.out.println(a+"\nNumber of cities in the HashSet "+a.size());
		if(a.contains("Paris"))
		{
		    System.out.println("Paris is in the popular cities set");
		}
		
	}
}
