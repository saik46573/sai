package first;

public class Propernumber 
{

	public static void main(String[] args)
	{
		int n=151649,i=0,j=0,rem=0,sum=0;
		for(i=n;i>0;i/=10)
		{
			rem=i%10;
			sum=0;
			for(j=1;j<=rem;j++)
			{
			
				if(rem%j==0)
					{
					sum=sum+j;
					}
			
			}
				System.out.println(" factors sum of number "+rem+" is "+sum);
				if(sum==rem)
				{
					System.out.println("proper number of "+rem);
		
				}
				else 
				{
					System.out.println("not a proper number of "+rem);	
				}
				
		}
		

	}

}
