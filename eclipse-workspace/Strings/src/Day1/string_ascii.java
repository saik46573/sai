package Day1;

public class string_ascii 
{

	public static void main(String[] args)
	{
		String s="ApPle";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			int a=0;
			if(s.charAt(x)>='A'&&s.charAt(x)<='Z')
			{
				 a=s.charAt(x)+32;
				char c=(char)a;	
				s1=s1+c;
			}
			else
			{
				 a=s.charAt(x)-32;
				char c=(char)a;	
				s1=s1+c;
			}
		}
		System.out.println(s1);
			
	}

}
