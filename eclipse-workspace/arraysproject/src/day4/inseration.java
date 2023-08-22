package day4;

import java.util.Scanner;

public class inseration 
{

	public static void main(String[] args) 
	{
		int a[]=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int x;
		for(x=0;x<a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("enter the index");
		int i=sc.nextInt();
		System.out.println("enter the element");
		int e=sc.nextInt();
		for(x=a.length-1;x>i;x--)
		{
			a[x]=a[x-1];
		}
		a[x]=e;
		for(int y:a)
		{
			System.out.println(y);
		}

	}
	

}
