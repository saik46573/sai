package pattern;

public class DiagonalP
{

	public static void main(String[] args) 
	{
		for(int x=1;x<=6;x++)
		{
				for(int y=1;y<=6;y++)
				{
					if(x==y||y==1||y==6||x==1||y==6||x==6||7-x==y)
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					
				}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
