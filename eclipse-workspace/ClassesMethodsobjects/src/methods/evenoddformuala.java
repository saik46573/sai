package methods;

import java.util.Scanner;

public class evenoddformuala 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int x=n;
		while(x>0)
		{
			if(n%2==0)
			{
				n=n/2;
				//System.out.println(n);
			}
			else
			{
				n=(3*n+1)/2;
				
			}
			System.out.println(n);
			x=n;
			if(x==1)
			{
				break;
			}
		}

	}

}
