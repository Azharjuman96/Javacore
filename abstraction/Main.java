package abstrac;
import java.util.Scanner;
public class Main {
	public static void main()
	{
	Scanner p=new Scanner(System.in);
	int a=p.nextInt();
	int b=p.nextInt();
	p.close();
	Interface m=new Interface();
	m.add(a,b);
	m.sub(a,b);
	m.mul(a,b);
	m.div(a,b);
	}
	

}
