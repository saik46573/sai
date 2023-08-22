package sai;

import java.util.Scanner;

public class palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
			int n=sc.nextInt();
			int rem;
			int sum=0;
	         int temp=n;
			
			while(n>0)
			{
			
				rem = n%10;
				sum= rem + sum*10;
				n=n/10;
				
				
			}
			if(temp==sum)
			{
			System.out.println(sum+ " is a palindrome");
			}
			else
			{
				System.out.println(sum+ " is not a palindrome");
			}
			
	}

} 
