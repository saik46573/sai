package Day5;

public class aabbbccc 
{

	public static void main(String[] args) 
	{
		String s="aabbbcccccc";
		char c[]=s.toCharArray();
		int count=0;
		for(char r:c)
			System.out.print(r+" ");
		System.out.println();
		for(int x=0;x<c.length;x=x+count)
		{
			count=0;
			for(int y=0;y<c.length;y++)
			{
				if(c[x]==c[y])
				{
					count++;
				}
			}
			System.out.print(c[x]+""+count+"");
			
		}

	}

}
