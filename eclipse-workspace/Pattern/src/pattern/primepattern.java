package pattern;
public class primepattern 
{
	public static void main(String[] args)
	{
		int i,j,k=0,count=0,count1=0,count2=0;
		for(i=1;i<=10;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				count=0;				
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
			System.out.println(i);
			count1++;
			}
		}
		System.out.println("count    ="+count1);
		k=count1;
		count2=1;
		
		while(count2<=k)
		{
			if(count1>1)
			System.out.println(i);
		count2++;
		count1++;
		}
	}
	
}