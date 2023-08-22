package day8;

public class uniqueelement_frequency 
{

	public static void main(String[] args) 
	{
		int a[]= {1,5,8,6,4,7,2,9,1,8,4,2};
		boolean b[]=new boolean[a.length];
		int x,y,count=1;
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
			if(count==1)
				System.out.println(a[x]+"--> "+count);
				
		}

	}

}
