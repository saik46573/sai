package Day6exam;

import java.util.Arrays;

public class biggest_number_from_given_number 
{

	public static void main(String[] args) 
	{
	   String s= new String("1255863245334");
	   char c[]=s.toCharArray();
	   Arrays.sort(c);
//	  for(char t:c)
//		   System.out.println(t);
	   for(int x=0;x<(c.length-1)/2;x++)
	   {
		   char temp=c[x];
		   c[x]=c[c.length-1-x];
		   c[c.length-1-x]=temp;
	   }
	   
//	String t=   Arrays.toString(c);
	   for(char t:c)
		   System.out.print(t);
	   String d="";
//		for(int x=0;x<c.length-1;x++)
//		{
//			
//			int a=Character.getNumericValue(c[x]);
//			for(int y=x+1;y<c.length;y++)
//			{
//				int b=Character.getNumericValue(c[y]);
//				if(a<b)
//				{
//				a=b;
//				}
//				
//			}
//			d=d+a;
//		}
//	System.out.println(d);

	}

}
