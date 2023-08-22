package pattern;

public class primepattern2 
{

	public static void main(String[] args) 
	{
		int i,j,count=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				if(count==0)
				{
					System.out.print(i);
				}
				
				//System.out.print("*");
			}
			System.out.println();
		}

	}

}
