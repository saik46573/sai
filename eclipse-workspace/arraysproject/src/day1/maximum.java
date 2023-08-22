package day1;

import java.util.Scanner;

public class maximum 
{

	public static void main(String[] args)
	{	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements");
	int a[]=new int[6];
	int max=1,min=1;
	int x=0,sum=0,product=1;
	for(;x<a.length;x++)
	{
		a[x]=sc.nextInt();
	}
	 max=a[0];
	for(x=0;x<a.length;x++)
	{
		
		if(max<a[x])
		{
			max=a[x];
		}
		
	}
	System.out.println("max value == "+max);
	min=a[0];
	for(x=0;x<a.length;x++)
	{
		 
		if(min>a[x])
		{
			min=a[x];
		}
		
	}
	System.out.println("min value== "+min);	
	}

}
