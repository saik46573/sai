package day5;

public class order_n_sort 
{

	public static void main(String[] args)
	{
		int a[]= {1,8,6,7,5,3,4,9,0,2};
		for(int y=0;y<a.length-1;y++)
		{
			if(a[y]>a[y+1])
			{
				int temp=a[y];
				a[y]=a[y+1];
				a[y+1]=temp;
				y=-1;
			}
		}
	for(int r:a)
		System.out.println(r);

	}

}
