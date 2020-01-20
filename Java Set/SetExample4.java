package JavaCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample4 
{
	public static void main(String[] args)
	{
        Scanner p=new Scanner(System.in);
        Set<Integer>a=new HashSet<Integer>();
		/*int n=p.nextInt();
		for(int i=0;i<n;i++)
		{
			a.add(p.nextInt());
		}*/
		a.addAll(Arrays.asList(new Integer[] {2,3,4,5,6,7,8,9,10}));
		Set<Integer>b=new HashSet<Integer>(a);
		Set<Integer>c=new HashSet<Integer>();
		System.out.println("numbers: "+a);
		b.remove(10);
		System.out.println("After remove(10): "+b);
		for(int x:a)
		{
			
			double sr=Math.sqrt(x);
			if(sr-Math.floor(sr)==0)
			{
				c.add(x);
			}
			
		}
		Set<Integer>difference=new HashSet<Integer>(b);
		difference.removeAll(c);
		System.out.println("After removeAll(perfectSquares): "+difference);
		b.clear();
		System.out.println("After clear() : "+b);

		
	}
}
