package Day3;

public class longest_word
{

	public static void main(String[] args)
	{
		String s="Java Coding Questions";
		long1 l=new long1();
		l.lo(s);
	}

}
class long1
{
	public void lo(String s)
	{
		int min=0,count=0,e=0;
		String s1[]=s.split(" ");
		for(String s2:s1)
			System.out.println(s2);
		for(int x=0;x<s1.length;x++)
		{
			count=0;
			for(int y=0;y<s1[x].length();y++)
			{
				count++;
			}
			if(min<count)
			{
				min=count;
				e++;
			}	
			
			
		}
		System.out.println(e);
		System.out.println(s1[e-1]);	
	}
	
}
