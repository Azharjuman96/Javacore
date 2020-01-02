package StringMethod;

public class CharAtExampleMain4 {
	public static void main(String[]args)
	{
		String str="welcome to FACE portal";
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
		   if(str.charAt(i)=='t')
		   {
			   count++;
		   }
		}
		System.out.println("Frequancy of t is: "+count);
				// last character is present length-1 index));
		
		
	}

}
