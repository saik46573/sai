package first;

import java.util.Scanner;

public class Strongnumber
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int x,y,fact=1,rem=0,sum=0,copy=0;
		copy=n;
		for(x=n;x>0;x/=10)
			{
				rem=x%10;
				fact=1;
				for(y=1;y<=rem;y++)
				{
					fact=fact*y;
				}
				sum=sum+fact;
			}
				if(copy==sum)
		{
			System.out.println("strong number "+n);
		}
		else
		{
			System.out.println("not a strong number " +n);
		}
	}

}
