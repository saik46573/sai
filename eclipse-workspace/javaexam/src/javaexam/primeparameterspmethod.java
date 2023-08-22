package javaexam;

import java.util.Scanner;

public class primeparameterspmethod 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		prime3 p=new prime3();
		int count=p.checkPrime(n);
		p.prime(count);
		

	}

}
class prime3
{
	public int checkPrime(int n)
	{
		
		int count= 0;
		for(int i=2;i<n/2;i++)
			 {
				if(n%i==0)
				  {
					
					count++;
					break;
							
				  }
			 }	
			return count;
	}
	public void prime(int count) 
	{
		if(count==0)
		{
			System.out.println(" is a prime number" );
		}
		else
		{
			System.out.println("not a prime");
			
		}
		
	}
}


