package methods;

public class Factors2 
{

	public static void main(String[] args) 
	{
		factor f=new factor();
		f.fact1();

	}

}
class factor
{
	public void fact1()
	{
		int i,j,k,l,rem=0,rem1,sum=0,temp=0;
		for(i=1;i<=100;i++)
			
			{
			System.out.println(i+" factors are ");
				for(j=1;j>=i;j/=10)
				{
					temp=j;
					rem=j%10;
					sum=sum+rem;
				}
				if(sum==temp)
				{
					for(k=1;k<=i;k++)
					{
						if(i%k==0)
						{
							System.out.print(k+" ");
						}
		
					}
				}
				else
				{
					for(k=1;k>=i;k++)
					{
						rem1=k%10;
						for(l=1;l>=i;l++)
						{
							if(rem%l==0)
								System.out.print(l+" ");
	    	
	    	
						}
					} 
				}
				System.out.println();
			}
	}
}