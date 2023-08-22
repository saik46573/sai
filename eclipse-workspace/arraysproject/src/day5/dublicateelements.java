package day5;

public class dublicateelements 
{

	public static void main(String[] args) 
	{
		int a[]= {1,5,8,6,4,7,2,9,1,8,4,2};
		int x,y,count=0;
		for(x=0;x<a.length;x++)
		{
			count=0;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y]&& x!=y)
				{
					System.out.println(a[x]);
					break;
				}
				
			}
		}
	}

}
