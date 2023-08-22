package pattern;

public class P4 
{
	public static void main(String[] args)
	{
		for(int x=5;x>=1;x--)
		{
			System.out.print("");
			//for(int y=1;y<=x;y++)
				for(int y=5;y>=x;y--)
			{
				System.out.print(" * ");
				//System.out.print(y);//for printing numeric values 
			}
			
			System.out.println();
		}
	}

}
