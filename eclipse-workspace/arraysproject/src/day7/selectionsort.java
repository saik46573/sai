package day7;

public class selectionsort
{

	public static void main(String[] args)
	{
		int a[]= {1,5,8,6,4,7,2,9};
		int x,y,min,temp;
		for(x=0;x<a.length;x++)
		{
			min=x;
			for(y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			temp=a[x];
			a[x]=a[min];
			a[min]=temp;
			
		}
		for(int r:a)
			System.out.println(r);

	}

}
