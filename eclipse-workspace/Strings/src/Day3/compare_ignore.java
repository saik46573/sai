package Day3;

public class compare_ignore 
{

	public static void main(String[] args)
	{
		String s="hello all Good morning";
		 String s2[]=s.split(" ");
		 for(String r:s2)
			 System.out.print(r+" ");
		 	System.out.println("");
		 System.out.println("after the comparetoingonore method");
		 for(int x=0;x<s2.length-1;x++)
		 {
			 for(int y=x+1;y<s2.length;y++) 
			 {
				 int z= s2[x].compareToIgnoreCase(s2[y]);
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
