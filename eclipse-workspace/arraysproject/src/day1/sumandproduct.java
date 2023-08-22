package day1;

import java.util.Scanner;

public class sumandproduct
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int a[]=new int[6];
		int x=0,sum=0,product=1;
		for(;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x++)
		{
		if(x%2==0)
		{
			sum=sum+a[x];	
		}
		
		else
		{
			product=product*a[x];
			
		}
		
		}
		System.out.println("sum of even index "+sum);
		System.out.println("product of odd index "+product);
	}

}
