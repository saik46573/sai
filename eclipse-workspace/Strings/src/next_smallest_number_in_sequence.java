import java.util.Arrays;
public class next_smallest_number_in_sequence 
{
	public static void main(String[] args) 
	{
		String n=new String("5655652");
		char c[]=n.toCharArray();
		int y,x,i,min=0;
		for(x=c.length-1;x>0;x--)
		{
			if(c[x-1]<c[x])
			{
				y=c[x-1];
				break;
			}			
		}
		if(x==0)
		{
			System.out.println("element not possiable");
		}
		else
		{
		       min=x;
			for(int z=x;z<c.length;z++)
			{
				if(c[z]<c[min])
				{
					min=z;
				}
			}
		}
		
		char temp=' ';
		if(min>x)
		{
			temp=c[x-1];
			c[x-1]=c[min];
			c[min]=temp;
		}
		//System.out.println(x);
		//System.out.println(min);
		for(int h=x;h<c.length;h++)
		{
			for(int g=h+1;g<c.length;g++)
			{
				if(c[h]>c[g])
				{
					char tem=c[h];
					c[h]=c[g];
					c[g]=tem;
				}
			}
			
		}
		for(char t:c)
			{
			   System.out.print(t);
			}
		
		
			
				
		
	}

}
