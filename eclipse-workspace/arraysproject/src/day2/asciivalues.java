
package day2;

public class asciivalues 
{
	public static void main(String[] args)
	{
		char c[]=new char[]{'a','e','A','#',' ',' ','1','9','&'};
		int x,s=0,a=0,n=0,y=0,p=0;
		for(x=0;x<c.length;x++)
		{
			if(c[x]>='a'&&c[x]<='z')
			{
				s++;
				
			}
			else if(c[x]>='A'&&c[x]<='Z')
			{
				a++;
				
			}
			else if(c[x]>='0'&&c[x]<='9')
			{
				n++;
				
			}
			
			else if(c[x]==' ')
			{
				p++;
				
			}
			else
			{
				y++;
			}
			
		}
		System.out.println("small letters  "+s);
		System.out.println("capital letters  "+a);
		System.out.println("numbers  "+n);
		System.out.println("symbols  "+y);
		System.out.println("spaces  "+p);
		
		
	}

}
