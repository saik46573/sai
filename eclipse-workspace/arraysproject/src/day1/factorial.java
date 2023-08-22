package day1;

public class factorial 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {6,7,8,9,10};
		int x,y,b=1;
		for(x=0;x<a.length;x++)
		{
			b=1;
			for(y=1;y<=a[x];y++)
			{
				b=b*y;
			}
			a[x]=b;
		}
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		

	}

}
