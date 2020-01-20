package JavaCollection;
import java.util.*;
public class SetExample2 
{
	public static void main(String[] args)
	{
		Scanner p=new Scanner(System.in);
		ArrayList<Integer>a=new ArrayList<Integer>();
		System.out.println("Enter the limit");
		int n=p.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(p.nextInt());
		}
		Set<Integer>b=new HashSet<Integer>();
		b.addAll(a);
		System.out.println(b);
	}

}
