package JavaCollection;

import java.util.*;

public class SetExample
{
	public static void main(String[]args)
	{
		Scanner p=new Scanner(System.in);
		//int m=p.nextInt();
		//int n=p.nextInt();
		Set<Integer>a=new TreeSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,0,5,3,7}));
		/*for(int i=0;i<n;i++)
		{
			a.add(p.nextInt());
		}*/
		Set<Integer>b=new TreeSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1,8,3,0,5,7,4,6,9}));
		/*for(int i=0;i<m;i++)
		{
			b.add(p.nextInt());
		}*/
		System.out.println(a);
		System.out.println(b);
		//to find union
		Set<Integer>union=new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("The union of two set is: ");
		System.out.println(union);
		//to find intersection
		Set<Integer>intersection=new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("The intersection of two set is: ");
		System.out.println(intersection);
		//to find difference
		Set<Integer>difference=new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("The difference of two set is: ");
		System.out.print(difference);
	}

}
