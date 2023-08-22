package pattern;

public class p1
{

	public static void main(String[] args)
	{
		for(int x=1;x<6;x++)
		{
			System.out.print("");
				for(int y=1;y<=x;y++)
				{
				//System.out.print("*  ");//for printing * pattern
				//System.out.print(+y);
				System.out.print((char)(63+x+y));//for printing char patterns 
				}
			System.out.println();
		}
		

	}

}
