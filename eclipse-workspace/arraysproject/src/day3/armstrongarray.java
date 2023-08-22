package day3;

public class armstrongarray 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,10,20,30,40,153,60};
		int x,y,count=0,rem=0,sum=0,n=0;
		for(x=0;x<a.length;x++)
		{
			n=a[x];
			count=0;
			for(y=a[x];y>0;y/=10)
			{
				count++;
			}
			sum=0;
			
			for(y=a[x];y>0;y/=10)
			{
				rem=y%10;
				sum=(int)(sum+Math.pow(rem, count));
			}
			if(n==sum)
			System.out.println(n);
		}
	}

}
