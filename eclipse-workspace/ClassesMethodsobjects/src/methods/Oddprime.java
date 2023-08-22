package methods;

public class Oddprime
{

	public static void main(String[] args) 
	{
		int x=0;
		for(x=1;x<=100;x++)
		{
			if(x==1)
			{
				System.out.println(x+" odd");
			}
			else if(x==2)
			{
				System.out.println(x+" even"+" prime");
			}
			else if(x%2!=0)
			{
				int count=0;
				for(int i=3;i<=x/2;i++)
				{
					if(x%i==0)
					{
						count++;
						break;
					}
			   }
				if(count==0)
				{
					System.out.println(x+" odd " + " prime");
				}
				else
				{
					System.out.println(x+" odd");
				}
			}
		}
				
	}

}
