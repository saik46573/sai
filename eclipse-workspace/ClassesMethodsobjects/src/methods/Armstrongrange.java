package methods;

import java.util.Scanner;

public class Armstrongrange
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	Armstrong c=new Armstrong();
		//System.out.println("enter the number");
		//int s=sc.nextInt();
		System.out.println("enter the range");
		int r=sc.nextInt();
		
		int sum=0,x;
		for( x=1;x<=r;x++)
		{
			int d=c.digits(x);
       		sum=c.calArm(x,d);
       		if(sum==x)
       		{
       			System.out.println(x);
       		}
		}
       		//else
       		//{
       	//		System.out.println("not a armstrong");
       	//	}
	}

}
class Armstrong
{
	public int digits(int n)
	{ 
		int digit=0;
		for(int x=n;x>0;x/=10)
		{
			digit++;
		}
		//System.out.println(digit);
		return digit;
	}
	public int calArm(int n,int digits)
	{  
		int rem=0,sum=0;
		for(int x=n;x>0;x/=10)
		{
			rem=x%10;
			sum=sum+power(rem,digits);
			
		}
		//System.out.println(sum);
		return sum;
	}
	public int power(int rem,int digits)
	{ 
		int add=1;
		for(int y=1;y<=digits;y++)
		{
			add=add*rem;
			
		}
		//System.out.println(add);
		return add;
	}
	
}
