package day1;

import java.util.Scanner;

public class evenposition 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int a[]=new int[6];
		int x=0;
		for(;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(x=0;x<a.length;x+=2)
		{
			System.out.println(a[x]);
		}
	}

}
