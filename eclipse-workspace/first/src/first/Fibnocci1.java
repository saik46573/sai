package first;

import java.util.Scanner;

public class Fibnocci1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=0,a1=0,a2=1;
		for(int x=1;x<n;x++)
		{
			System.out.println(a1);
			a=a1+a2;
			a1=a2;
			a2=a;
		}
	}

}
