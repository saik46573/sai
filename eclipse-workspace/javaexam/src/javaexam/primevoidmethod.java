package javaexam;

import java.util.Scanner;

public class primevoidmethod
{

	public static void main(String[] args) 
	{
		prime1 p=new prime1();
		p.checkPrime();
	}

}
class prime1
{
	public void checkPrime()
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
				System.out.println(n+"not a prime");
				
			}
	}
}
