package javaexam;

import java.util.Scanner;

public class Primeintmethod
{

	public static void main(String[] args) 
	{
		prime2 p=new prime2();
		int count=p.checkPrime();
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
class prime2
{
	public int checkPrime()
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
			return count;
	}
}
