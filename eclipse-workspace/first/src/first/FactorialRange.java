package first;

import java.util.Scanner;

public class FactorialRange
{
	public static void main(String Args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int fact=1,x,y;
		for(x=1;x<=n;x++)
		{
			fact=1;
			for(y=1;y<=x;y++)
			{
				fact=fact*y;
				
			}
			System.out.println(fact);
		}
	}

}
