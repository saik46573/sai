package sai;

import java.util.Scanner;

public class armstrong 
{

	public static void main(String[] args) 
	{
		
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			int rem = n%10;
			sum = sum +(rem*rem*rem);
			n=n/10;
			
		}
		if(temp==sum)
		{
		System.out.println( sum +   " is a arm strong  number");
		}
		else
		{
			System.out.println( sum +   " is not a arm strong number");
		}
	}

}
