package day2;

public class intersection
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {3,4,5,6,7};
		int x,y;
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<b.length;y++)
			{
				if(a[x]==b[y])
				{
					System.out.println(a[x]);
				}
				
			}
		}
	}

}
