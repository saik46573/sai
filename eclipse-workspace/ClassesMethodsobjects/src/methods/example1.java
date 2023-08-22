package methods;
import java.util.*;
class UG
{
	public void cources()
	{
		System.out.println("offered cources");
		System.out.println("Btech  B.Sc ");
		//System.out.println("select UG or PG");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cource");
		String s=sc.next();
		sc.nextLine();
		
		String c="Btech";
		if(c.equals(s))
		{
			System.out.println("offered cources  " + "  CSE ECE EEE MECH");
			System.out.println("fee == 1000000");
			System.out.println("avaliable college");
			
		}
		else
		{
			System.out.println("bcom  bsc ba ");
			System.out.println("fee == 500000");
			System.out.println("avaliable college");
			
		}
		
	}
}
class PG
{
	public void cources1()
	{
		System.out.println("offered cources");
		System.out.println("mtech  m.Sc ");
		//System.out.println("select UG or PG");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cource");
		String s=sc.next();
		sc.nextLine();
		String c="mtech";
		
		if(c.equals(s))
		{
			System.out.println("CSE ECE EEE MECH");
			System.out.println("fee == 13000000");
			System.out.println(" avaliable college");
			
		}
		else
		{
			System.out.println("mcom  msc ma ");
			System.out.println("fee == 500000");
			System.out.println(" avaliable college");
			
		}
		
	}
	
	
}
public class example1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the course");
		System.out.println("select UG or PG");
		String s=sc.next();
		sc.nextLine();
		String c="UG";
		if(c.equals(s))
		{
			System.out.println("it UG");
			UG u=new UG();
			u.cources();
		}
		else
		{
			System.out.println("it PG");
			PG p=new PG();
			p.cources1();
		}
		}
}