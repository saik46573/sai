package methods;

import java.util.Scanner;

public class NcrNpr
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter  n the number");
        int q=sc.nextInt();
        System.out.println("enter r the number");
        int R=sc.nextInt();
        N c=new N();
        int n= c.calNfactorial(q);
        int r = c.calrfactorial(R);
        int v = c.calvfactorial(q-R);
        int g=q/r;
        int h=q/(v*r);
        System.out.println("value of NcR "  +g);
        System.out.println("value of NpR "+h);
	}

}
class N
{
	public int calNfactorial(int q)
	{
	 int add=1;
		{
			for(int i=1;i<=q;i++)
			{
				add=add*1;
			}
		
	    }
		return add;
	}
	public int calrfactorial(int r)
	{
	 int add=1;
		{
			for(int i=1;i<=r;i++)
			{
				add=add*1;
			}
		
	    }
		return add;
	}
	public int calvfactorial(int v)
	{
	 int add=1;
		{
			for(int i=1;i<=v;i++)
			{
				add=add*1;
			}
		
	    }
		return add;
	}
	
}