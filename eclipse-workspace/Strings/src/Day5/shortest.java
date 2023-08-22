package Day5;

public class shortest 
{

	public static void main(String[] args)
	{
		String s="Hello All Good Morning";//HAGM
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='A'&&s.charAt(x)<='Z')
			{
				s1=s1+s.charAt(x);
			}
				
		}
		System.out.println(s1);

	}

}
