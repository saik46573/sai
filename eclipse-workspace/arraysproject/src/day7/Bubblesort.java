package day7;

public class Bubblesort
{

	public static void main(String[] args)
	{
		int a[]= {1,5,8,6,4,7,2,9};
		int x,y,n=a.length-1,temp;
		for(x=0;x<n;x++)
		{
			for(y=0;y<n-x;y++)
			{
				if(a[y]>a[y+1])
				{
					temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		for(int r:a)
		{
			System.out.println(r);
		}

	}

}
