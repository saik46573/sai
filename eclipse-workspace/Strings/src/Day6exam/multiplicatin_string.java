package Day6exam;

public class multiplicatin_string
{

	public static void main(String[] args)
	{
		String s="a10b12c10";
		int y=1;
		char c=' ';
		String temp="1";
		int count=1;
		for(int x=0;x<s.length();x++)
		{
				c=s.charAt(x);
				if(Character.isDigit(c))
				{
					temp=temp+c;		
				}
				else if(Character.isAlphabetic(c))
				{
					y=y*Integer.parseInt(temp);					
					temp="0";
				}
		}
		y=y*Integer.parseInt(temp);
		
		System.out.println(y);
		
		System.out.println("======================");
		System.out.println("method 2");
		System.out.println("======================");
		
		String s1="a12b7c9";
		String s2=" ";
		int i=0;
		int y1=0,count1=0;int e=1;
		for(int x=0;x<s1.length();x++)
		{
			if(Character.isAlphabetic(s1.charAt(x)))
			{
				y=0;
				for(int z=x+1;z<s1.length();z++)
				{
					if(Character.isDigit(s1.charAt(z)))
							{
								int j=Character.getNumericValue(s1.charAt(z));
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
