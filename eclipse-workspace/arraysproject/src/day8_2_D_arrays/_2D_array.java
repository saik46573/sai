package day8_2_D_arrays;

import java.util.Scanner;

public class _2D_array 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int r=sc.nextInt();
		System.out.println("enter number of colowns");
		int c=sc.nextInt();	
		int a[][]=new int[r][c];
		System.out.println("enter array element");
		//int sum=0;
		for(int x=0;x<r;x++)
		{
			for(int y=0;y<c;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		for(int x=0;x<r;x++)
		{
			for(int y=0;y<c;y++)
			{
				System.out.print(a[x][y]+" ");
				
			}
			System.out.println();
		}
		System.out.println("right diagonal");
		for(int x=0;x<r;x++)
		{
			System.out.print(a[x][x]+" ");
				
		}
		System.out.println();
		System.out.println("left diagonal");
		
			for(int x=0,y=a.length-1;x<a.length;x++,y--)
			{
				System.out.print(a[x][y]+" ");
				
			}
			System.out.println();
			System.out.println("transpose matrix");
			for(int x=0;x<r;x++)
			{
				for(int y=0;y<c;y++)
				{
					System.out.print(a[y][x]+" ");
					
				}
				System.out.println();
			}

	}

}
