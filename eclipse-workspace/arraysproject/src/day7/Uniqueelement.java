package day7;

public class Uniqueelement
{

	public static void main(String[] args)
	{
		int a[]= {1,5,8,6,4,7,2,9,1,8,4,2};
		int x,y,count=0;
		for(x=0;x<a.length;x++)
		{
			count=0;
			for(y=0;y<a.length;y++)
			{
				if(a[x]==a[y]&& x!=y)
				{
					count++;
					
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println(a[x] + "  ");
			}
			
				
		}

	}

}
