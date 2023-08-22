package day6EXAM;

public class palindrome
{

	public static void main(String[] args)
	{
		int n=341,temp=0;
		pal p=new pal();
		int result=p.palin(n,temp);
		if(result==n)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println(" not a palindrome");
			

	}

}
class pal
{
	public int palin(int n,int temp)
	{
		if(n==0)
			return temp;
		temp=temp*10+n%10;
		return palin(n/10,temp);
		

	}
}