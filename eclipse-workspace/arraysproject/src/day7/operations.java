package day7;

public class operations
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		int i,e=0,f=0,z=0,x=0,u=0;
		for(i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				e++;
			}
			else
				f++;
		}
		int b[]=new int[e];
		int c[]=new int[f];
		for(int y=0;y<a.length;y++)
		{
			if(y%2==0)
			{
				b[z]=a[y];
				z++;
			}
			else
			{
				c[x]=a[y];
						x++;
			}
			
		}
		for(int r:b)
			System.out.print(r);
		System.out.println();
		for(int s:c)
			System.out.print(s);
		System.out.println();
		int d[]=new int[e+f];
		for(i=b.length-1;i>=0;i--)
		{
			d[u]=b[i];
			u++;
		}
		u=4;
		for(i=0;i<c.length;i++)
		{
			
			d[u]=c[i];
			u++;
		}
		for(int p:d)
			System.out.print(p);
			
		

	}

}
