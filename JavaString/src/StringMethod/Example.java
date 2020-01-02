package StringMethod;
import java.util.regex.*;
 class Example 
 {
	 public static void main(String[]args)
	 {
		 Pattern pattern=Pattern.compile("FACE");
		 Matcher m=pattern.matcher("Face - Focus Academy for Career Enhancement - Face");
		 while(m.find())
		 {
		   System.out.println("Pattern found from"+m.start()+" to "+(m.end()-1));	
		 }
	 }
	 

}
