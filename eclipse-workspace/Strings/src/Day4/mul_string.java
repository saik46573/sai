package Day4;

public class mul_string 
{

	public static void main(String[] args) 
	{
		String s="a10b12c13";
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

	}

}
