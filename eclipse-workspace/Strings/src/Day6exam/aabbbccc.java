package Day6exam;

public class aabbbccc
{

	public static void main(String[] args)
	{
		String s=new String("aaaaabbbvvvvccc");
		int x, count=1;
		for(x=0;x<s.length()-1;x++)
		{
			if(s.charAt(x)!=s.charAt(x+1)&&count==1)
			{
				System.out.print(s.charAt(x));
				System.out.print(count);
			}
			else if(s.charAt(x)==s.charAt(x+1))
			{
				count++;
			}
			else if(s.charAt(x)!=s.charAt(x+1)&&count>=2)
			{
				System.out.print(s.charAt(x));
				System.out.print(count);
				count=1;
			}
		
		}
		System.out.print(s.charAt(x));
		System.out.print(count);
	}
}

				