package Day3;

import java.util.Arrays;

public class anagram 
{

	public static void main(String[] args)
	{
		String s="tea";
		String s1="eat";
		a b=new a();
		boolean d=b.ana(s,s1);
		if(d==true)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}
		
		

	}

}
class a
{
	public boolean ana(String s,String s1)
	{
		if(s.length()==s1.length())
		{
			char c[]=s.toCharArray();
			char c1[]=s1.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c1);
			if(Arrays.equals(c, c1))
			{
				return true;
			}
			else 
				return false;
		}
		else 
		     return false;
		
	}
}
