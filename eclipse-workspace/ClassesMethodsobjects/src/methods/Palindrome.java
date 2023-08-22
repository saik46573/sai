package methods;
import java.util.*;
class Palindrome1
{
	int n,rev;
	public int Palin()
	{
		for(int y=n;y>0;y/=10)
		{ 
			//int rev=0;
			int rem=y%10;
			rev=rev*10+rem;
		}
		return rev;
	}
	public boolean checkPalin()
	{
		if(rev==n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		return true;
	}
}

public class Palindrome 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		Palindrome1 p=new Palindrome1();
		p.n=sc.nextInt();
		p.Palin();
		boolean b=p.checkPalin();
		System.out.println(b);

	}

}
