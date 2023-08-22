package day3;

public class pairelements
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,5,0,5,4,6,9,1};
		int x,y,k=10;
		for(x=0;x<a.length;x++)
		{
			for(y=a.length-1;y>x;y--)
			{
				if(a[x]+a[y]==k)
				{
					System.out.println(a[x]+" "+a[y]);
				}
			}
		}
	}

}
