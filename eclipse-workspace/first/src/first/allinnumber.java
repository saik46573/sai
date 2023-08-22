package first;

public class allinnumber {

	public static void main(String[] args)
	{
		int n=12,rem=0,sum=0,rem1=0,sum1=0;
		int sq1=n*n;
		System.out.println(sq1);
		for(int x=1;x<=100000;x++)
		{
			x=n;
			rem1=0;rem=0;sum=0;sum1=0;
			for(;n>0;n/=10)
			{
				rem=n%10;
				sum=sum*10+rem;
			}
			int sq2=sum*sum;
			System.out.println(sum);
			System.out.println(sq2);
			for(;sq2>0;sq2/=10)
			{
			rem1=sq2%10;
			sum1=sum1*10+rem1;
			}
			System.out.println(sum1);
			if(sq1==sum1)
			{
			System.out.println(x);
			}
			
		}
		
	}

}
