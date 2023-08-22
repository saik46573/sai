package day1;

public class evenodd
{

	public static void main(String[] args) 
	{
		int x=0,y=0;
		int a[]=new int[]{1,2,3,4,5,6,7,8};
		int b[]=new int[a.length];
		for(x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				b[y]=a[x];
				y++;
			}
		}
		y=4;
		for(x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
			{
				b[y]=a[x];
				y++;
			}
		}
			for(y=0;y<b.length;y++)
			{
			System.out.println(b[y]);
			}
	   }
		
	}

