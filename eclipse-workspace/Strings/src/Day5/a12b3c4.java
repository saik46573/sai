package Day5;

public class a12b3c4 
{

	public static void main(String[] args)
	{
		String s="a12b7c9";
		String s2=" ";
		int i=0;
		int y=0,count=0;int e=1;
		for(int x=0;x<s.length();x++)
		{
			if(Character.isAlphabetic(s.charAt(x)))
			{
				y=0;
				for(int z=x+1;z<s.length();z++)
				{
					if(Character.isDigit(s.charAt(z)))
							{
								int j=Character.getNumericValue(s.charAt(z));
								y=y*10+j;
							}
					else
					{
						e=e*y;
						break;
					}
					
				}
	
			}  			
			
		}
		e=e*y;
		System.out.println(e);

	}

}
