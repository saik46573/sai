package Day3;

import java.util.Arrays;

public class compare 
{

	public static void main(String[] args) 
	{
		String s="hello all Good morning";
		 String s2[]=s.split(" ");
		 for(int x=0;x<s2.length-1;x++)
		 {
			 for(int y=x+1;y<s2.length;y++) 
			 {
				 int z= s2[x].compareTo(s2[y]);
					if(z>0)
					{
						String temp=s2[x];
						s2[x]=s2[y];
						s2[y]=temp;
					}
					 
			 }
			
			
			
		 }
		 for(String d:s2)
		 {
			 System.out.print(d+" ");
		 }
		
		 

	}

}
