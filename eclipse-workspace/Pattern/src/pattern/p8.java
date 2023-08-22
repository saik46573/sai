package pattern;

public class p8
{

	public static void main(String[] args)
	{
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=x;y++)
			{
			System.out.print("*");
			}
			for(int z=5;z>x;z--)
			{
			System.out.print(" ");
			}
			for(int z=5;z>x;z--)
			{
			System.out.print(" ");
			}
			for(int y=1;y<=x;y++)
			{
			System.out.print("*");
			}
			System.out.println();
	}
		for(int x=1;x<=5;x++)
		{
			for(int y=x;y<5;y++)
			{
			System.out.print("*");
			}
			for(int z=1;z<=x;z++)
			{
			System.out.print(" ");
			}
			for(int z=1;z<=x;z++)
			{
			System.out.print(" ");
			}
			for(int y=x;y<5;y++)
			{
			System.out.print("*");
			}
			System.out.println();
	}
		
	}

}
