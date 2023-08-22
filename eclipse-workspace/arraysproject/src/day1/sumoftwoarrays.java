package day1;

import java.util.Scanner;

public class sumoftwoarrays
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the elements");
		int a[]=new int[]{1,2,3,4,5};
		//System.out.println("enter the elements");
		int b[]=new int[]{6,7,8,9,10};
		int c[]=new int[10];
		int x=0;
		int mid=(c.length-1)/2;
		//for(y=0;y<a.length;y++)
		//{
			//a[x]=sc.nextInt();
		//}
		//for(z=0;z<b.length;z++)
		//{
		//	b[x]=sc.nextInt();
		//}
		for(x=0;x<c.length;x++)
		{
			if(x<=mid)
			{
				c[x]=a[x];
			}
			else
			{
				c[x]=b[x-mid-1];
			}
		}
		for(x=0;x<c.length;x++)
		{
			System.out.println(c[x]);
		}
	}

}
