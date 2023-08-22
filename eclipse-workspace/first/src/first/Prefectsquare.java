package first;

public class Prefectsquare 
{

	public static void main(String[] args) 
	{
		int n=144925,i=0,rem=0,count=0,p=0;
		for(i=n;i>0;i/=100)
		{
			rem=i%100;
			count++;
			if(count==1||count==2||count==3)
			{
				p=(int)Math.sqrt(rem);
			}
			if(p*p==rem)
			{
				System.out.println(rem+" prefect square");
			}
			else
			{
				System.out.println(rem+" not a prefect square");
			}
		}
		
	}

}
