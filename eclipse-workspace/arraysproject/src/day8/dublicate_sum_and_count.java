package day8;

public class dublicate_sum_and_count 
{

	public static void main(String[] args) 
	{
		int a[]= {1,5,8,6,4,7,2,9,1,8,4,2};
		boolean b[]=new boolean[a.length];
		int x,y,count=1,sum=0,c=0,max=0;
		for(x=0;x<a.length;x++)
		{
			count=1;
			if(b[x]==true)
				continue;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=true;
					count++;
				}
					
			}
			if(count>1)
			{
				if(max<a[x])
				{
					max=a[x];
				}
				System.out.println(a[x]+"--> "+count);
				c++;
				sum=sum+a[x];
				
			}
			
			
				
		}
		System.out.println("largest dublicate element-->"+max);
		System.out.println("sum of dublicate elements-->"+sum);
		System.out.println("number of dublicate elements-->"+c);

	}

}
