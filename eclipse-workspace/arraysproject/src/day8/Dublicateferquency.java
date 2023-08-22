package day8;

public class Dublicateferquency
{

	public static void main(String[] args) 
	{
		int a[]= {1,5,8,6,4,7,2,9,1,8,8,4,2};
		//boolean b[]=new boolean[a.length];
		int x,y,count=0,max=0,element=0;
		for(x=0;x<a.length;x++)
		{
			count=1;
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
				}
				
				
		    }
			if(max<count)
			{
				max=count;
				element=a[x];
			}
				
			
		}
		System.out.println("highest reapted element-=>"+element);
		
	}

}
