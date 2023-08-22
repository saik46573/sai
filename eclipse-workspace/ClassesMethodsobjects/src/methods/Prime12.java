package methods;

import java.util.Scanner;

public class Prime12
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long n=sc.nextInt();
		int count= 0;
		for(int i=2;i<n/2;i++)
			 {
				if(n%i==0)
				  {
					
					count++;
					break;
							
				  }
			 }	
			if(count==0)
			{
				System.out.println(n+" is a prime number" );
			}
			else
			{
				System.out.println("not a prime");
				
			}

		

	}

}
