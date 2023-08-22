package day5;

import java.util.Arrays;

public class secondlargest
{

	public static void main(String[] args)
	{
		int a[]= {5,8,4,3,2,9,7,5,4,2,3,6,9,8,7,1,9};
		Arrays.sort(a);
		System.out.println("after sort");
		for(int r:a)
		{
		
			System.out.print(r+" ");
		}
		System.out.println();
	
		System.out.println("second largest element");
		int x;
		for(x=a.length-1;x>=0;x--)
		{
			if(a[x]==a[x-1])
			{
				continue;
			}
			else
			{
				System.out.println(a[x-1]);
				break;
			}
		}

	}

}
