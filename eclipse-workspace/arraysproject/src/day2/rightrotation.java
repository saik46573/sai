package day2;

public class rightrotation
{

	public static void main(String[] args)
	{
		
			int a[]=new int[] {1,2,3,4,5,6};
			int x,y=0,r=5;
			for(x=a.length-r;x<a.length;x++)
			{
				System.out.println(a[x]);
			}
			for(x=0;x<a.length-r;x++)
			{
				System.out.println(a[x]);
			}

	}

}
