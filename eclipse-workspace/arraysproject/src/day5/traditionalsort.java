package day5;

public class traditionalsort 
{

	public static void main(String[] args) 
	{
		int a[] ={1,7,5,8,4,3,9,0,8};
		for(int x=0;x<a.length;x++)
			{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
			}
		for(int r:a)
			System.out.println(r);

	}

}
