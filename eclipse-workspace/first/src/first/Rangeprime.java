package first;

import java.util.Scanner;

public class Rangeprime 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int x,y,fact=0,count=0;
		System.out.println("prime in range "+n);
		for(x=1;x<=n;x++)
		{
			fact=0;
			for(y=2;y<=x/2;y++)
			{
				if(x%y==0)
				{
					fact++;
				}
			}
			if(fact==0)
			{
				System.out.println(x);
				count++;
			}
			
		}
		System.out.println("number of prime numbers === "+count);
	}

}
