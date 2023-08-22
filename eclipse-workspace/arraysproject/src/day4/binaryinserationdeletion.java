package day4;

import java.util.Arrays;
import java.util.Scanner;

public class binaryinserationdeletion
{

	public static void main(String[] args) 
	{
		int a[]=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("after sorting");
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		int low=0,high=a.length-1,mid=0,temp=0;
		System.out.println("enter the searching value");
		int s=sc.nextInt();
		while(low<=high)
		{
			 mid=(low+high)/2;
			if(a[mid]==s)
			{
				System.out.println("element found "+mid);
				temp=1;
				break;
			}
			else if(a[mid]<s)
			{
				low=mid+1;
			}
			else if(a[mid]>s)
			{
				high=mid-1;
			}
			
		}
		if(temp==1)
			System.out.println(" found");
		else
			System.out.println("NOT found");
		int d=a[mid];
		int i=mid;
		for(x=i;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		for(int r:a)
		{
			System.out.println(r);
		}

	}

}
