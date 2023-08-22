package day8_2_D_arrays;

public class matrix_multiplication 
{

	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,1,1},{2,2,2},{3,3,3}};
		int b[][]=new int[][]{{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				c[x][y]=0;
				for(int k=0;k<3;k++)
				{
					c[x][y]=c[x][y]+a[x][k]*b[k][y];
				}
				System.out.print(c[x][y]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("addition matrix");
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				d[x][y]=a[x][y]+b[x][y];
			}
		}
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(d[x][y]+" ");
			}
			System.out.println();
		}
		
		
	}

}
