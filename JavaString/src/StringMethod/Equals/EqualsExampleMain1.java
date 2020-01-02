package StringMethod;

public class EqualsExampleMain1 
{
	public static void main(String[]args)
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="facenxt";
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s1.contentEquals(s4));
	}

}
