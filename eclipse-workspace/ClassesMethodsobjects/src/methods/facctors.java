package methods;
class method
{
	public void factors()
	{
		int i,j,fact=0;
		for(i=1;i<=100;i++)
		{
			System.out.print(i+" factors are " );
			for(j=1;j<=i;j++)
			{ 
				if(i%j==0)
				{
					//fact++;
					System.out.print(j+" ");
						
				}
				
			}
			System.out.println();
		}
	}

}
class facctors
{
	public static void main(String args[])
	{
		method m=new method();
		m.factors();
	}
	
}
