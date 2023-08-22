package pattern;

public class p5 {

	public static void main(String[] args)
	{
		int i,j,k,l;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			for(l=i;l<5;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
