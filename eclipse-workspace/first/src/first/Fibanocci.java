package first;

import java.util.Scanner;

public class Fibanocci 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int rem=0,sum=0;
		for(int x=i;x>0;x/=10)
		{
			rem=x%10;
			sum=sum*10+rem;
		}
		System.out.println(sum);
		if(i==sum)
		{
		System.out.println("palindrome");	
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
