package sai;

import java.util.*;
public class prime 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the number");
			long n=sc.nextInt();
			int flag = 0;
				{
								for(int i=2;i<n/2;i++)
				    {
					if(n%i==0)
					    {
						System.out.println(n+" is not a prime number" );
						flag = 1;
						break;
					
					     }
				     }
			   }		
	if(flag==0)
	{
		System.out.println(n+" is a prime number" );
	}
	}

}
