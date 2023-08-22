package day2;

public class addingpreviouselements 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[a.length];
		int x,y=0;
		for(x=0;x<a.length;x++)
		{
			if(a[x]==a[0])
			{
				b[y]=a[x]+a[x+1];
				y++;
			}
			else if(a[x]==a[a.length-1])
			{
				b[y]=a[a.length-1]+a[a.length-2];
				y++;
			}
			else
			{
				b[y]=a[x-1]+a[x+1];
				y++;
			}
		}
		for(int r:b)
		System.out.println(r);

	}

}
