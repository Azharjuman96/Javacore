package StringMethod;

public class ConcatExampleMain1 
{
	public static void main(String[]args)
	{
		String s1="Java string";
	    s1.concat("is immutable");
	    System.out.println(s1);
	    s1=s1.concat("is immutable so assign it explicity");
	    System.out.println(s1);
	}

}
