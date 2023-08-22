package methods;

public class Primepattern 
{

	public static void main(String[] args) 
	{
		Prime123 p=new Prime123();
		p.pattern();

	}

}
class Prime123
{
	//int count=0;
	public boolean calPrime(int n)
	{
		int count=0;
		
		for(int x=1;x<=n;x++)
		{
			if(n%x==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void pattern()
	{
		 int c=0;
	for(int x=1;x<=5;x++)
	{
		for(int s=x;s<=1;s++)
		{
			System.out.print("");
		}
		for(int y=1;y<=x;y++)
		{
		
			while(!calPrime(c))
			{
				//System.out.print(c+" ");
				c++;
			}
				System.out.print(c+" ");
				c++;
		}
	
		System.out.println();
	}
	}
}