package day9;

public class higest_neighbour
{

	public static void main(String[] args) 
	{
		int a[]= {5,10,7,15,20};
		for(int x=0;x<a.length;x++)
		{
			if(x==0&&a[x]<a[x+1])
			{
				System.out.println(a[x]);
			}
			else if(a[a.length-1]>a[x-1]&&x==a.length-1)
			{
				System.out.println(a[x]);
			}
			else if(a[x]<a[x-1]&&a[x]<a[x+1])
			{
				System.out.println(a[x]);
			}
		}

	}

}
